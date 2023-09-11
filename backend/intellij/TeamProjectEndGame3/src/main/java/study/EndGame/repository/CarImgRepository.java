package study.EndGame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.EndGame.entity.CarImg;

import java.util.List;

@Repository
public interface CarImgRepository extends JpaRepository<CarImg, Long> {
    List<CarImg> findByCarIdOrderByIdAsc(Long carId);

    CarImg findByCarIdAndRepImgYn(Long carId, String repImgYn);
}
