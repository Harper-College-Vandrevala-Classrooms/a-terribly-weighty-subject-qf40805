package com.csc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
    private static final double OUNCES_IN_A_POUND = 16.0;

    public String toPounds(int ounces) {
        if (ounces < 0) throw new IllegalArgumentException("Ounces cannot be negative.");
        double pounds = (double) ounces / OUNCES_IN_A_POUND;
        return String.format("%.4f", pounds);
    }

    public String toPoundsAndOunces(int ounces) {
        if (ounces < 0) throw new IllegalArgumentException("Ounces cannot be negative.");
        int pounds = ounces / 16; 
        int remainingOunces = ounces % 16;
        return pounds + " pounds and " + remainingOunces + " ounces";
    }

    public String toOunces(int pounds, int ounces) {
        if (pounds < 0 || ounces < 0) throw new IllegalArgumentException("Pounds and ounces cannot be negative.");
        int totalOunces = (pounds * 16) + ounces;
        return totalOunces + " ounces";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("Test Cases for toOunces Method:");
        System.out.println("2 pounds and 4 ounces = " + converter.toOunces(2, 4)); 
        System.out.println("1 pound and 0 ounces = " + converter.toOunces(1, 0)); 
        System.out.println("0 pounds and 16 ounces = " + converter.toOunces(0, 16)); 
        System.out.println("0 pounds and 0 ounces = " + converter.toOunces(0, 0)); 
        System.out.println("3 pounds and 8 ounces = " + converter.toOunces(3, 8)); 

        try {
            System.out.print("Enter ounces to convert: ");
            int ounces = scanner.nextInt();
            System.out.println(ounces + " ounces is equal to " + converter.toPounds(ounces) + " pounds.");
            System.out.println(ounces + " ounces is equal to " + converter.toPoundsAndOunces(ounces) + ".");

            System.out.print("Enter pounds: ");
            int pounds = scanner.nextInt();
            System.out.print("Enter ounces: ");
            int additionalOunces = scanner.nextInt();
            System.out.println(pounds + " pounds and " + additionalOunces + " ounces is equal to " + converter.toOunces(pounds, additionalOunces) + ".");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
