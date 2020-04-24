package com.company;

import java.util.ArrayList;

public class CurrencyConverter extends Calculator {

    ArrayList<ExchangeRate> exchangeRates;

    public CurrencyConverter() {
        this.exchangeRates = getExchangeRates();
    }

    public void convert (double amount, String toCurrency){
        ExchangeRate toRate = null;

        for (int i = 0; i < exchangeRates.size(); i++) {
            ExchangeRate tempExchangeRate = exchangeRates.get(i);

            if(tempExchangeRate.getCurrency().equals(toCurrency)){
                toRate = tempExchangeRate;
                break;
            }
        }

        if(toRate != null){
             System.out.println(amount * toRate.getExchangeRate());
            System.out.println(amount + " Euro convertet to " +toCurrency+ ": "+  multiplication(amount, toRate.getExchangeRate()));
        }
    }

    private ArrayList<ExchangeRate> getExchangeRates(){
        ArrayList<ExchangeRate> list = new ArrayList<>();
        list.add(new ExchangeRate("USD", 1.09));
        list.add(new ExchangeRate("CHF", 1.05));
        list.add(new ExchangeRate("GBP", 0.87));

        return list;
    }
}

