package study.EndGame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.EndGame.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    // 추가적인 쿼리 메서드가 필요하다면 여기에 작성할 수 있습니다.
}