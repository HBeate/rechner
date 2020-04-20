package com.company;

public class GeoCalculator extends Calculator {

    private double pi = 3.141592654;


    public void getAreaSquare(double x) {
        multiplication(x, x);

    }
    public void getCircumfenceSquare(double x){
        multiplication(4, x);
    }

    public void getAreaRectangle(double x, double y) {

        multiplication(x, y);

    }

    public void getCircumfenceRectangle(double x, double y){
        addition(x, y);
    //    double twoSides = getResult();
        multiplication(getResult(), 2);

    }
    public void getCircumfenceCircle(double radius){
        double diameter = 2*radius;
        multiplication(diameter, pi);
    }

    public void getAreaCircle(double radius) {
       double squareRadius  = multiplication(radius, radius);
        multiplication(squareRadius, pi);


    }
}
