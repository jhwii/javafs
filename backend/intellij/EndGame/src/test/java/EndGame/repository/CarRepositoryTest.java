package EndGame.repository;

import EndGame.constant.CarSellStatus;
import EndGame.entity.Car;
import EndGame.entity.QCar;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
class CarRepositoryTest {

    @PersistenceContext
    EntityManager em;

    @Autowired
    CarRepository carRepository;

    @Test
    @DisplayName("차량 등록 테스트")
    public void createCarTest() {
        Car car = new Car();
        car.setCarNm("520D");
        car.setType("대형");
        car.setBrand("BMW");
        car.setColor("red");
        car.setPrice(35000000);
        car.setManufacture(2015);
        car.setStockNumber(1);
        car.setCarSellStatus(CarSellStatus.SELL);
        car.setRegTime(LocalDateTime.now());
        car.setUpdateTime(LocalDateTime.now());
        Car savedCar = carRepository.save(car);
        System.out.println(savedCar.toString());
    }


    public void createCarList() {
        for (int i = 1; i <= 5; i++) {
            Car car = new Car();
            car.setCarNm("테스트 상품" + i);
            car.setType("대형");
            car.setBrand("BMW");
            car.setColor("red");
            car.setPrice(10000 + i);
            car.setCarDetail(i + "번 차량 상세정보 : 띠리띠리");
            car.setManufacture(2015);
            car.setStockNumber(1);
            car.setCarSellStatus(CarSellStatus.SELL);
            Car savedCar = carRepository.save(car);
        }
    }

    @Test
    @DisplayName("상품명 조회 테스트")
    public void findByCarNmTest() {
        this.createCarList();
        List<Car> carList = carRepository.findByCarNm("테스트 상품1");
        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }

    @Test
    @DisplayName("차명 또는 상세설명 테스트")
    public void findByCarNmOrCarDetail(){
        this.createCarList();
        List<Car> carList =
                carRepository.findByCarNmOrCarDetail("테스트 상품1", "테스트 상품 상세 설명 쏼라쏼라");
        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }


    @Test
    @DisplayName("가격 LessThan 테스트")
    public void findByPriceLessThanTest() {
        this.createCarList();
        List<Car> carList = carRepository.findByPriceLessThan(10005);
        for (Car car : carList) {
            System.out.println(car.toString());


        }
    }
    @Test
    @DisplayName("가격 내림차순 조회 테스트")
    public void findByPriceLessThanOrderByPriceDesc() {
        this.createCarList();
        List<Car> carList = carRepository.findByPriceLessThanOrderByPriceDesc(10005);
        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }

    @Test
    @DisplayName("@Query를 이용한 상품 조회 테스트")
    public void findByCarDetailTest() {
        this.createCarList();
        List<Car> carList = carRepository.findByCarDetail("테스트 상품 상세 설명");
        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }

    @Test
    @DisplayName("Querydsl 조회 테스트1")
    public void queryDslTest(){
        this.createCarList();
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        QCar qCar = QCar.car;
        JPAQuery<Car> query = queryFactory.selectFrom(qCar)
                .where(qCar.carSellStatus.eq(CarSellStatus.SELL))
                .where(qCar.carDetail.like("%"+"테스트 상품 상세 설명"+"%"))
                // .where(qCar.price.lt(10005))
                .orderBy(qCar.price.desc());
        List<Car> carList = query.fetch();

        for (Car car : carList) {
            System.out.println(car.toString());
        }

    }



}

