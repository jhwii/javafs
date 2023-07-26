package com.example.firstproject.controller;

import com.example.firstproject.dto.CoffeeForm;
import com.example.firstproject.entity.Coffee;
import com.example.firstproject.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class CoffeeController {
    @Autowired
    private CoffeeRepository coffeeRepository;

    @PostMapping("/articles/createcoffee")
    public String createCoffeeForm(CoffeeForm form){
        log.info(form.toString());

        Coffee coffee = form.toEntity();
        log.info(coffee.toString());

        Coffee saved = coffeeRepository.save(coffee);
        log.info(saved.toString());
        return "redirect:/articles/" + saved.getId();
    }

}
