package study.EndGame.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/security-login")
public class CarSearchController {

    @GetMapping(value = "/search")
    public String main(){

        return "search/carSearchForm";
    }
}
