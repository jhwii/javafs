package study.EndGame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.EndGame.entity.CarImg;

@Repository
public interface CarImgRepository extends JpaRepository<CarImg, Long> {
}
