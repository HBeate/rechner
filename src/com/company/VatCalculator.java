package com.company;

import java.util.ArrayList;

public class VatCalculator extends Calculator {
    private double taxAt = 20;
    private double taxCh = 7.7;
    private double taxFl = 7.7;
    private double taxDe = 19;
    private double taxIt = 20;
    private double taxFr = 20;
    private double taxHu = 27;
    private double grossPrice;
    private double netPrice;

    public VatCalculator(double taxAt) {
    }

    public double getGrossPrice(double amount) {
       //TODO je nach Land die Mehrwertsteuer dazurechnen
        return grossPrice;
    }

    public double getNetPrice() {
        //TODO je nach Land die Mehrwertsteuer abziehen
        return netPrice;
    }
}
