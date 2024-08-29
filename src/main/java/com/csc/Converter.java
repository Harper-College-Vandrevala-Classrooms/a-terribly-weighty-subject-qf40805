package com.csc;

// Conversion factor from ounces to pounds
public class Converter {
    private static final double OUNCES_IN_A_POUND = 16.0;

    public String toPounds(int ounces) {
        // Convert ounces to pounds as a decimal
        double pounds = (double) ounces / OUNCES_IN_A_POUND;
        return String.format("%.2f", pounds);
    }

    public String toPoundsAndOunces(int ounces) {
        // Calculate pounds and remaining ounces
        int pounds = ounces / 16; 
        int remainingOunces = ounces % 16; // Remainder for ounces
        return pounds + " pounds and " + remainingOunces + " ounces";
    }

    public String toOunces(int pounds, int ounces) {
        int totalOunces = (pounds * 16) + ounces; // Convert pounds to ounces and add remaining ounces
        return totalOunces + " ounces";
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        int ounces = 34; 
        System.out.println(ounces + " ounces is equal to " + converter.toPounds(ounces) + " pounds.");
        System.out.println(ounces + " ounces is equal to " + converter.toPoundsAndOunces(ounces) + ".");
        int pounds = 2; 
        System.out.println(pounds + " pounds and " + ounces + " ounces is equal to " + converter.toOunces(pounds, ounces) + ".");
    }
}
