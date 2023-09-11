package study.EndGame.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.EndGame.entity.CarImg;
import study.EndGame.repository.CarImgRepository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
public class CarImgService {

    private final EntityManager entityManager;

    private final CarImgRepository carImgRepository;

    @Autowired
    public CarImgService(CarImgRepository carImgRepository, EntityManager entityManager) {
        this.carImgRepository = carImgRepository;
        this.entityManager = entityManager;
    }

    @Transactional
    public CarImg saveCarImg(CarImg carImg) {
        return carImgRepository.save(carImg);
    }

    public List<CarImg> getAllCarImgs() {
        return carImgRepository.findAll();
    }

    public Optional<CarImg> getCarImgById(Long id) {
        return carImgRepository.findById(id);
    }

    @Transactional
    public void deleteCarImg(Long id) {
        carImgRepository.deleteById(id);
    }

}
