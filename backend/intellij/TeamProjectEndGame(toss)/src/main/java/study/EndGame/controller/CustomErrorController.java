package study.EndGame.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/security-login")
public class CustomErrorController {

    @GetMapping("/error")
    public String handleError() {
        // 오류 페이지로 이동
        return "errorPage/errorPage"; // errorPage는 실제로 만들어야 함
    }
}