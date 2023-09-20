package study.EndGame.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import study.EndGame.dto.CarRegistrationDto;
import study.EndGame.dto.CarSearchDto;
import study.EndGame.dto.SearchCarDto;
import study.EndGame.entity.Car;
import study.EndGame.entity.User;
import study.EndGame.service.UserService;
import study.EndGame.service.car.CarService;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/security-login")
public class SearchCarController {
    private final CarService carService;
    private final UserService userService;

    @GetMapping(value = "/search")
    public String search(CarSearchDto carSearchDto, Optional<Integer> page, Model model, Authentication auth) {

        if(auth != null) {
            User loginUser = userService.getLoginUserByLoginId(auth.getName());
            if (loginUser != null) {
                model.addAttribute("nickname", loginUser.getNickname());
            }
        }

        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 6);
        Page<SearchCarDto> cars = carService.getMainCarPage(carSearchDto, pageable);
        model.addAttribute("cars", cars);
        model.addAttribute("carSearchDto", carSearchDto);
        model.addAttribute("maxPage", 5);

        return "search/carSearch";
    }

    @GetMapping(value = "/car/{carId}")
    public String carDtl(Model model, @PathVariable("carId") Long carId , Authentication auth){
        CarRegistrationDto carRegistrationDto = carService.getCarDtl(carId);

        if(auth != null) {
            User loginUser = userService.getLoginUserByLoginId(auth.getName());
            if (loginUser != null) {
                model.addAttribute("nickname", loginUser.getNickname());
            }
        }

        model.addAttribute("car", carRegistrationDto);
        return "car/carDtl";
    }
}