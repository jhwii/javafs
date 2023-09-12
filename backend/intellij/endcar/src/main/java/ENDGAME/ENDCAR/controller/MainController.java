package ENDGAME.ENDCAR.controller;


import ENDGAME.ENDCAR.entity.User;
import ENDGAME.ENDCAR.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
