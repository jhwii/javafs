package study.EndGame.controller;//package study.EndGame.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import study.EndGame.dto.SearchFormDto;
//import study.EndGame.entity.Car;
//import study.EndGame.repository.CarRepository;
//import study.EndGame.service.car.CarSearchService;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Controller
//@RequestMapping("/security-login")
//public class CarSearchController {
//    private final CarSearchService carSearchService;
//
//    private final CarRepository carRepository;
//
//    @Autowired
//    public CarSearchController(CarSearchService carSearchService, CarRepository carRepository) { // 수정된 서비스 클래스명
//        this.carSearchService = carSearchService;
//        this.carRepository = carRepository;
//    }
//
//
//    @GetMapping("/search")
//    public String listCars(Model model) {
//        List<Car> cars = carRepository.findAll();
//
//        // 차량 엔티티를 DTO로 변환
//        List<SearchFormDto> carDtos = cars.stream()
//                .map(this::convertToDto)
//                .collect(Collectors.toList());
//
//        model.addAttribute("cars", carDtos);
//        return "search/carSearch";
//    }
//    private SearchFormDto convertToDto(Car car) {
//        SearchFormDto dto = new SearchFormDto();
//        dto.setCarId(car.getId());
//        dto.setCarBrand(car.getCarBrand());
//        dto.setCarName(car.getCarName());
//        dto.setCarType(car.getCarType());
//        dto.setCarColor(car.getCarColor());
//        dto.setCarManufacturingDate(car.getCarManufacturingDate());
//        dto.setCarPrice(car.getCarPrice());
//        dto.setCarOption(car.getCarOption());
//        return dto;
//    }
///*    @GetMapping(value = "/search")
//    public String RegistrationCarSearch(Model model) {
//        return "search/carSearch";
//    }*/
//}
//
