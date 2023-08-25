package EndGame.repository;

import EndGame.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CarRepository extends JpaRepository<Car, Long>,
        QuerydslPredicateExecutor<Car>{

    List<Car> findByCarNm(String carName);

    List<Car> findByCarNmOrCarDetail(String carNm, String carDetail);

    List<Car> findByPriceLessThan(Integer price);

    List<Car> findByPriceLessThanOrderByPriceDesc(Integer price);


    @Query("select c from Car c where c.carDetail like %:carDetail% order by c.price desc" )
    List<Car> findByCarDetail(@Param("carDetail") String carDetail);

    @Query(value = "select * from car c where c.car_detail like %:carDetail% order by c.price desc", nativeQuery = true)
    List<Car> findByCarDetailByNative(@Param("carDetail") String carDetail);
}
