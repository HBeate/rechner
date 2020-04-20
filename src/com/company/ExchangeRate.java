package com.company;

public class ExchangeRate {
    private String currency;
    private double exchangeRate;

    public ExchangeRate(String currency, double exchangeRate){
        this.currency = currency;
        this.exchangeRate = exchangeRate;
    }

    public String getCurrency(){
        return this.currency;
    }

    public double getExchangeRate(){
        return this.exchangeRate;
    }
}
