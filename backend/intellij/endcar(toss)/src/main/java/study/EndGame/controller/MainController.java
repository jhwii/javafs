package study.EndGame.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import study.EndGame.dto.JoinRequest;
import study.EndGame.dto.LoginRequest;
import study.EndGame.entity.User;
import study.EndGame.service.UserService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/security-login")
public class MainController {

    private final UserService userService;

    @GetMapping(value = {"", "/"})
    public String home(Model model, Authentication auth) {

        if(auth != null) {
            User loginUser = userService.getLoginUserByLoginId(auth.getName());
            if (loginUser != null) {
                model.addAttribute("nickname", loginUser.getNickname());
            }
        }

        return "home";
    }

    @GetMapping(value = {"event"})
    public String event(){
        return "event";
    }
    @GetMapping(value = {"customerSupport"})
    public String CS(){
        return "customerSupport";
    }

}
