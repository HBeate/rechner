package com.company;

public class Calculator {
    public double result;

    public Calculator() {
    }

    public double addition(double x, double y ) {
         result = x + y;
        return result;
    }

    public double subtraction(double x, double y) {
        result = x - y;
        return result;
    }

    public double multiplication(double x, double y) {
        result = x * y;
        return result;
    }

    public double getResult() {
        return result;
    }

    public double division(double x, double y) {
        if (y!= 0){
            result= x / y;
        }else{
            System.out.print("Division by 0 not possible. ");
        }
        return result;

    }

}
