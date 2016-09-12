package com.anthony;

import java.util.Scanner;

public class Main {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Get distance traveled
        System.out.println("What distance did you travel? ");
        // Create variables
        double distance = numberScanner.nextDouble();
        System.out.println("How much gas did you use? ");
        // Get amount of gas used
        double gasUsage = numberScanner.nextDouble();

        // Calculate mpg using method metersToFeet
        double milesPerGallon = metersToFeet(distance, gasUsage);

        // Output calculations
        System.out.println("Your used " + milesPerGallon + " miles to one gallon of gas");

        numberScanner.close();
        stringScanner.close();
    }

    private static double metersToFeet(double distanceMeters, double gasUsage) {
        // Calculate the mpg
        double mpg = (distanceMeters / gasUsage);
        return mpg;
    }
}
