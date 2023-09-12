package ENDGAME.ENDCAR.repository;

import ENDGAME.ENDCAR.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

//    List<Car> findByCarName(String carName);
//    List<Car> findByCarNameOrCarDetail(String carName, String carDetail);
//    List<Car> findByPriceLessThan(Integer price);
//    List<Car> findBypriceLessThanOrderByPriceDesc(Integer price);

}
