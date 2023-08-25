package EndGame.controller;

import EndGame.dto.CarDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class SearchController {

    @GetMapping(value = "/item/search")
    public String main(Model model){

        return "search/search";
    }

}
