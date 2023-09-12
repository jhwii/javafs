package ENDGAME.ENDCAR.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping(value = "/thymeleaf")
public class Controller {
    @GetMapping(value = "/ex07")
    public String thymeleafExample07(){
        return"thymeleafEx/thymeleafEx07";
    }

}
