package EndGame.controller;

import EndGame.dto.CarDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class MainController {

/*
    @GetMapping(value = "/")
    public String main(Model model){
        model.addAttribute("data"," 한잔하지");
        return"main";
    }
*/

    @GetMapping(value = "/")
    public String main(Model model){
        CarDto carDto = new CarDto();
        carDto.setCarName("520D");
        carDto.setType("대형");
        carDto.setBrand("BMW");
        carDto.setColor("red");
        carDto.setPrice(35000000);
        carDto.setManufacture(2015);
        carDto.setCarDetail("최상등급");
        carDto.setStockNumber(1);
        carDto.setSellStatus("SELL");
        carDto.setRegTime(LocalDateTime.now());
        model.addAttribute("carDto", carDto);
        return "main";
    }


}
