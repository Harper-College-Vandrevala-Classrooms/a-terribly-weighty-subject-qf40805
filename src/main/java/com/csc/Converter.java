package com.csc;

public class Converter {
    private static final double OUNCES_IN_A_POUND = 16.0;

    public String toPounds(int ounces) {
        double pounds = (double) ounces / OUNCES_IN_A_POUND;
        return String.format("%.4f %s", pounds, (pounds == 1.0 ? "lb" : "lbs"));
    }

    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16; 
        int remainingOunces = ounces % 16; 
        return pounds + " lb" + (pounds != 1 ? "s" : "") + (remainingOunces > 0 ? " " + remainingOunces + " oz" : "");
    }

    public String toOunces(int pounds, int ounces) {
        if (pounds < 0 || ounces < 0) {
            throw new IllegalArgumentException("Pounds and ounces must be non-negative.");
        }
        int totalOunces = (pounds * 16) + ounces; 
        return totalOunces + " ounces";
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        
        System.out.println(converter.toPounds(0)); 
        System.out.println(converter.toPounds(16)); 
        System.out.println(converter.toPoundsAndOunces(50)); 
        System.out.println(converter.toPoundsAndOunces(2)); 
        System.out.println(converter.toOunces(5, 100)); 
        System.out.println(converter.toOunces(9, 30));
    }
}
