package com.example.demo.fizzBuzz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    public List<String> FizzBuzzList() {
        List<String> number = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                number.add("FizzBuzz");
            } else if (i % 3 == 0) {
                number.add("Fizz");
            } else if (i % 5 == 0) {
                number.add("Buzz");
            } else {
                number.add(String.valueOf(i));
            }
        }
        return number;
    }
}