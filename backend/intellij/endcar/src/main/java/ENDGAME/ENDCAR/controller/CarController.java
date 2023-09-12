package ENDGAME.ENDCAR.controller;

import ENDGAME.ENDCAR.dto.CarFormDto;
import ENDGAME.ENDCAR.entity.Car;
import ENDGAME.ENDCAR.entity.User;
import ENDGAME.ENDCAR.service.AuthenticationFacade;

import ENDGAME.ENDCAR.service.CarService;
import ENDGAME.ENDCAR.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/security-login")
public class CarController {

    private final UserService userService;
    private final CarService carService;

    @Autowired
    private final AuthenticationFacade authenticationFacade;

    @GetMapping("/car/carForm")
    public String carForm(Model model) {
        model.addAttribute("carFormDto", new CarFormDto());
        return "/car/carForm";
    }

    @PostMapping(value = "/car/carForm")
    public String carNew(@Valid CarFormDto carFormDto, BindingResult bindingResult,
                         Model model, @RequestParam("carImgFile") List<MultipartFile> carImgFileList) {
        if (bindingResult.hasErrors()) {
            return "security-login/car/carForm";
        }
        if (carImgFileList.get(0).isEmpty() && carFormDto.getId() == null) {
            model.addAttribute("errorMessage", "첫번째 상품 이미지는 필수 입력 값 입니다.");
            return "security-login/car/carForm";
        }
        try {
            carService.saveCar(carFormDto, carImgFileList);
        } catch (Exception e) {
            model.addAttribute("errorMessage", "상품 등록 중 에러가 발생하였습니다.");
            return "security-login/car/carForm";
        }

        return "redirect:/security-login";
    }
//    @GetMapping(value = "/carForm")
//    public String CarForm (Model model, Authentication auth) {
//        if(auth != null) {
//            User loginUser = userService.getLoginUserByLoginId(auth.getName());
//            if (loginUser != null) {
//                model.addAttribute("nickname", loginUser.getNickname());
//            }
//        }
//        model.addAttribute("carFormDto", new CarFormDto());
//        return "car/carForm";
//    }
//    @PostMapping(value = "/carForm")
//    public String CarForm (@ModelAttribute @Valid CarFormDto carFormDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
//        if (bindingResult.hasErrors()) {
//            return "car/carForm";
//        }
//
//        // Convert DTO to Entity
//        Car car = new Car();
//        car.setCarBrand(carFormDto.getCarBrand());
//        car.setCarName(carFormDto.getCarName());
//        car.setCarType(carFormDto.getCarType());
//        car.setCarColor(carFormDto.getCarColor());
//        car.setCarManufacturingDate(carFormDto.getCarManufacturingDate());
//        car.setCarPrice(carFormDto.getCarPrice());
//        car.setCarOption(carFormDto.getCarOption());
//
//
//
//        // Save the car
//        carFormService.carForm(car);
//
//        redirectAttributes.addFlashAttribute("successMessage", "차량이 성공적으로 등록되었습니다.");
//
//        return "redirect: security-login";
//    }
}
