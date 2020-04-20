package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        GeoCalculator geoCalculator = new GeoCalculator();
        System.out.println("CALCULATOR");
        calculator.addition(10, 5);
        System.out.println("Result (+): " + calculator.getResult());
        calculator.subtraction(17, 4);
        System.out.println("Result (-): " + calculator.getResult());
        calculator.multiplication(3, 7);
        System.out.println("Result (*): " + calculator.getResult());
        calculator.division(15, 3);
        System.out.println("Result (/): " + calculator.getResult());

        System.out.println("\nGeoCALCULATOR");
        geoCalculator.getAreaSquare(4);
        System.out.println("Result Area Square: \t" + geoCalculator.getResult() + " cm2.");

        geoCalculator.getAreaRectangle(3, 4);
        System.out.println("Result Area Rectangle: \t" + geoCalculator.getResult() + " cm2.");

        geoCalculator.getAreaCircle(3);
        System.out.println("Result Area Circle: \t" + geoCalculator.getResult() + " cm2.");

        geoCalculator.getCircumfenceSquare(3);
        System.out.println("Result Curcumfence Square: \t" + geoCalculator.getResult() + " cm2.");

        geoCalculator.getCircumfenceRectangle(3,4);
        System.out.println("Result Curcumfence Rectangle: \t" + geoCalculator.getResult() + " cm2.");

        geoCalculator.getCircumfenceCircle(3);
        System.out.println("Result Curcumfence Circle: \t" + geoCalculator.getResult() + " cm2.");


    }
}
