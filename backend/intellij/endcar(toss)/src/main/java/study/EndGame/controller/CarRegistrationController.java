package study.EndGame.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import study.EndGame.dto.CarRegistrationDto;
import study.EndGame.entity.Car;
import study.EndGame.service.AuthenticationFacade;
import study.EndGame.service.car.CarRegistrationService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/security-login")
public class CarRegistrationController {

    private final CarRegistrationService carRegistrationService;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @GetMapping(value = "/registration")
    public String RegistrationForm(Model model) {
        model.addAttribute("carRegistrationDto", new CarRegistrationDto());
        return "car/carRegistration";
    }
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


        // Save the car
        carRegistrationService.registerCar(car);

        redirectAttributes.addFlashAttribute("successMessage", "차량이 성공적으로 등록되었습니다.");

        return "redirect:/security-login";
    }
}
