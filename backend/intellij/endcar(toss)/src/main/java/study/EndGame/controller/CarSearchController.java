package study.EndGame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import study.EndGame.dto.SearchFormDto;
import study.EndGame.entity.Car;
import study.EndGame.exception.CarNotFoundException;
import study.EndGame.repository.CarRepository;
import study.EndGame.service.car.CarSearchService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/security-login")
public class CarSearchController {
    private final CarSearchService carSearchService;
    private final CarRepository carRepository;

    @Autowired
    public CarSearchController(CarSearchService carSearchService, CarRepository carRepository) { // 수정된 서비스 클래스명
        this.carSearchService = carSearchService;
        this.carRepository = carRepository;
    }


    @GetMapping("/search")
    public String listCars(Model model) {
        List<Car> cars = carRepository.findAll();

        // 차량 엔티티를 DTO로 변환
        List<SearchFormDto> carDtos = cars.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());

        model.addAttribute("cars", carDtos);
        return "search/carSearch";
    }

    private SearchFormDto convertToDto(Car car) {
        SearchFormDto dto = new SearchFormDto();
        dto.setCarId(car.getId());
        dto.setCarBrand(car.getCarBrand());
        dto.setCarName(car.getCarName());
        dto.setCarType(car.getCarType());
        dto.setCarColor(car.getCarColor());
        dto.setCarManufacturingDate(car.getCarManufacturingDate());
        dto.setCarPrice(car.getCarPrice());
        dto.setCarOption(car.getCarOption());
        return dto;
    }

    @GetMapping(value = "/{car_id}")
    public String RegistrationCarDetailPage(Model model, @PathVariable("car_id") Long carId) {
        // carId에 해당하는 차량 정보 가져오기
        Optional<Car> car = carRepository.findById(carId);

        if (car.isPresent()) {
            // 차량 정보를 모델에 추가
            model.addAttribute("car", car.get());
        } else {
            // 차량을 찾을 수 없을 경우 에러 처리
            throw new CarNotFoundException("Car with ID " + carId + " not found");
        }

        return "car/carDtl";
    }

}