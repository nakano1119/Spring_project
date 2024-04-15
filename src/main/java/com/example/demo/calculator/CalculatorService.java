package com.example.demo.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String calculator(int num1, String cal, int num2) {
    	int x = 0;
    	String result = "";
    	if (cal.equals("+")) {
    		x = num1 + num2;
    		result = String.valueOf(x);
		} else if (cal.equals("-")) {
			x = num1 - num2;
			result = String.valueOf(x);
		} else if (cal.equals("×")) {
			x = num1 * num2;
			result = String.valueOf(x);
		} else if (cal.equals("÷")) {
			if (num2 != 0) {
				x = num1 / num2;
				result = String.valueOf(x);
			} else {
				result = "除数を0にできません";
			}
			
		}
    	
        return result;
    }
}