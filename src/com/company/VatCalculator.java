package com.company;

import java.util.ArrayList;

public class VatCalculator extends Calculator {

    ArrayList<Vat> vats;

    public VatCalculator() {
        this.vats = getVats();
    }

    public void getGrossPrice(double amount, String countryCode) {

        Vat NetGross = null;

        NetGross = getVatFromArray(countryCode, NetGross);

        if (NetGross != null) {
            System.out.print("Amount: " + amount);
            System.out.print("\t\tVAT (" + countryCode.toUpperCase()+"): "  + multiplication(amount, NetGross.getVatByCountry()));
            System.out.println("\t\tGross: " + addition(amount, result));
        }
    }

    public void getNetPrice(double amount, String countryCode) {
        Vat NetGross = null;
        NetGross = getVatFromArray(countryCode, NetGross);
//TODO Why does my Math.round not round to two decimals???
        if (NetGross != null) {
            System.out.print("Amount: " + amount);
            double net = (division(amount, (1+NetGross.getVatByCountry())));
            System.out.print("\t\tVAT (" + countryCode.toUpperCase()+"): " + (subtraction(amount, net)));
            System.out.println("\t\tNet: " + net);

        }
    }

    private Vat getVatFromArray(String countryCode, Vat NetGross) {
        for (int i = 0; i < vats.size(); i++) {
            Vat tempVat = vats.get(i);
            if (tempVat.getCountryCode().equalsIgnoreCase(countryCode)) {
                NetGross = tempVat;
                break;
            }
        }
        return NetGross;
    }

    private ArrayList<Vat> getVats() {
        ArrayList<Vat> vatList = new ArrayList<>();
        vatList.add(new Vat("AT", 0.20));
        vatList.add(new Vat("CH", 0.077));
        vatList.add(new Vat("FL", 0.077));
        vatList.add(new Vat("DE", 0.19));
        vatList.add(new Vat("IT", 0.20));
        vatList.add(new Vat("FR", 0.20));
        vatList.add(new Vat("HU", 0.27));
        return vatList;
    }
}

