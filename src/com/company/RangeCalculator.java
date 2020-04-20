package com.company;
//        8 Litern pro 100 gefahrene Kilometer und ein Tankvolumen von 80 Litern
//        80*100/8 = 1000

public class RangeCalculator extends Calculator {
    private Double remainingRange;
    private double literPer100;
    private double remainingGas;

    public RangeCalculator() {

    }

    public Double getRemainingRange(double literPer100, double capacity) {
        multiplication(capacity, 100);
        division(result, literPer100);
        return result;
    }


}
