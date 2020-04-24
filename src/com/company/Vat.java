package com.company;

public class Vat {
    private String countryCode;
    private double vatByCountry;

    public Vat(String countryCode, double vatByCountry) {
        this.countryCode = countryCode;
        this.vatByCountry = vatByCountry;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public double getVatByCountry() {
        return this.vatByCountry;
    }
}
