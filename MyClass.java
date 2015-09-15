package com.example;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int meters, kilo, kph, liters, grams, centi;

        System.out.print("Enter an amount of meters: ");
        meters = scan.nextInt();
        System.out.println(meters + " meters = " + meters * 1.09361 + " yards");
        System.out.print("Enter an amount of kilometers: ");
        kilo = scan.nextInt();
        System.out.println(kilo + " kilometers = " + kilo * 0.621371 + " miles");
        System.out.print("Enter an amount of centimeters: ");
        centi = scan.nextInt();
        System.out.println(centi + " centimeters = " + centi * 0.393701 + " inches");
        System.out.print("Enter an amount of kilometers per hour: ");
        kph = scan.nextInt();
        System.out.println(kph + " kilometers per hour = " + kph * 0.911344 + " feet per second");
        System.out.print("Enter an amount of liters: ");
        liters = scan.nextInt();
        System.out.println(meters + " liters = " + liters * 1.05669 + " quarts");
        System.out.print("Enter an amount of kilograms: ");
        grams = scan.nextInt();
        System.out.println(meters + " kilograms = " + grams * 2.20462 + " pounds");
    }
}
