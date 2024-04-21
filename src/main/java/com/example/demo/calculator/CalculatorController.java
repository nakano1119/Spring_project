package com.example.demo.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping("calculator")
	public String showCalculatorForm() {
		return "calculator.html";
	}

    @PostMapping("calculator")
    public String calculator(@RequestParam("num1") int num1, @RequestParam("cal") String cal, @RequestParam("num2") int num2, Model model) {

        String result = calculatorService.calculator(num1, cal, num2);
        model.addAttribute("result", result);

        return "calculator.html";
    }
}