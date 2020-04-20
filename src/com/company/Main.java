package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        GeoCalculator geoCalculator = new GeoCalculator();
        CurrencyConverter converter = new CurrencyConverter();
        RangeCalculator rangeCalculator = new RangeCalculator();

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
        geoCalculator.getCircumfenceRectangle(3, 4);
        System.out.println("Result Curcumfence Rectangle: \t" + geoCalculator.getResult() + " cm2.");
        geoCalculator.getCircumfenceCircle(3);
        System.out.println("Result Curcumfence Circle: \t" + geoCalculator.getResult() + " cm2.");
        System.out.println("\nCurrencyConverter");

        converter.convert(10, "USD");
        converter.convert(10, "CHF");
        converter.convert(10, "GBP");

        System.out.println("\nRangeCalculator");
        System.out.println("You have gas for "+ rangeCalculator.getRemainingRange(8, 80) + " more kilometers.");
        System.out.println("You have gas for "+ rangeCalculator.getRemainingRange(8, 30) + " more kilometers.");

    }
//    private ArrayList<ExchangeRate> getExchangeRates(){
//        ArrayList<ExchangeRate> list = new ArrayList<>();
//        list.add(new ExchangeRate("USD", 1.09));
//        list.add(new ExchangeRate("CHF", 1.05));
//        list.add(new ExchangeRate("GBP", 0.87));
//
//        return list;
}


