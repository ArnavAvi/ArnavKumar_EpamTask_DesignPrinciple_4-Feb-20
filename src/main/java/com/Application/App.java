package com.Application;

import com.Application.Calculator.Calculator;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        float num1,num2;
        char operator;
        while(true) {
            System.out.println("Enter first number: ");
            num1 = sc.nextFloat();
            System.out.println("Enter operator (+,-,*,/)");
            while(true){
                operator = sc.next().charAt(0);
                if(operator=='+'||operator=='-'||operator=='*'||operator=='/'){
                    break;
                }
                else{System.out.println("Invalid operator kindly retry +,-,*,/");}
            }
            System.out.println("Enter second number: ");
            num2 = sc.nextFloat();
            System.out.println("Result-> " + calculator.operate(num1,num2,operator));
            System.out.println("Press 0 to quit & For another calculation Press 1");
            if(sc.nextInt()==(1)){}
            else{
                System.out.println("Thanks for using the calculator");break;}
        }

    }
}
