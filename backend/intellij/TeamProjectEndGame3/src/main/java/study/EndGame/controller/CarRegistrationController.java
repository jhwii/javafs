package study.EndGame.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import study.EndGame.dto.CarRegistrationDto;
import study.EndGame.entity.Car;
import study.EndGame.service.AuthenticationFacade;
import study.EndGame.service.car.CarRegistrationService;
import study.EndGame.service.car.CarService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/security-login")
public class CarRegistrationController {

    private final CarRegistrationService carRegistrationService;

    /*0908추가*/
    private final CarService carService;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @GetMapping(value = "/registration")
    public String RegistrationForm(Model model) {
        model.addAttribute("carRegistrationDto", new CarRegistrationDto());
        return "car/carRegistration";
    }

    /*0908주석처리*/
/*
    @PostMapping(value = "/registration")
    public String handleCarRegistration(@ModelAttribute @Valid CarRegistrationDto carRegistrationDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "car/carRegistration";
        }

        // Convert DTO to Entity
        Car car = new Car();
        car.setCarBrand(carRegistrationDto.getCarBrand());
        car.setCarName(carRegistrationDto.getCarName());
        car.setCarType(carRegistrationDto.getCarType());
        car.setCarColor(carRegistrationDto.getCarColor());
        car.setCarManufacturingDate(carRegistrationDto.getCarManufacturingDate());
        car.setCarPrice(carRegistrationDto.getCarPrice());
        car.setCarOption(carRegistrationDto.getCarOption());
        car.setCarStockNumber(carRegistrationDto.getCarStockNumber());

        // Update carSellStatus
        car.updateCarSellStatus();

        // Save the car
        carRegistrationService.registerCar(car);

        redirectAttributes.addFlashAttribute("successMessage", "차량이 성공적으로 등록되었습니다.");

        return "redirect:/security-login";
        }*/
    @PostMapping(value = "/registration")
    public String carNew(@Valid CarRegistrationDto carRegistrationDto, BindingResult bindingResult,
                         Model model, @RequestParam("carImgFile") List<MultipartFile> carImgFileList){
        if(bindingResult.hasErrors()){
            return "dto/carRegistrationDto";
        }
        if(carImgFileList.get(0).isEmpty() && carRegistrationDto.getId() == null){
            model.addAttribute("errorMessage", "첫번째 상품 이미지는 필수 입력 값 입니다.");
            return "dto/carRegistrationDto";
        }
        try {
            carService.saveCar(carRegistrationDto, carImgFileList);
        } catch (Exception e){
            model.addAttribute("errorMessage", "상품 등록 중 에러가 발생하였습니다.");
            return "dto/carRegistrationDto";
        }

        return "redirect:/security-login";
    }
}
