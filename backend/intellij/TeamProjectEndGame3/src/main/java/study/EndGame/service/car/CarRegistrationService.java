package study.EndGame.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.EndGame.entity.Car;
import study.EndGame.repository.CarRepository;

import java.util.List;

@Service
public class CarRegistrationService {

    private final CarRepository carRepository;

    @Autowired
    public CarRegistrationService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void registerCar(Car car) {
        carRepository.save(car);
    }


}