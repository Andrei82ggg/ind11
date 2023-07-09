package com.example.ind11sp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorController {
    @GetMapping("/calculator")
    public String hello(){
        return "Добро пожаловать в КАЛЬКУЛЯТОР!";
    }
}
