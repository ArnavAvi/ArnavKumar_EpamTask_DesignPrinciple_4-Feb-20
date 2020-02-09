package com.Application.Calculator;

import com.Application.MathOperations.Functions;

public class Calculator {
    Functions f = new Functions();
    public float operate(float a, float b, char operator) {
        if(operator=='+') {
            return f.add(a,b);
        }
        else if(operator=='-') {
            return f.sub(a,b);
        }
        else if(operator=='*') {
            return f.multiply(a,b);
        }
        else if(operator=='/') {
            return f.divide(a,b);
        }
        else
            return -999;
    }
}
