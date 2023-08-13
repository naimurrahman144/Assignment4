package capter5;

import java.util.Scanner;

public class DecimalComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two floating-point numbers: ");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();

        if (areAlmostEqual(number1, number2, 2)) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
    }

    public static boolean areAlmostEqual(double num1, double num2, int decimalPlaces) {
        double tolerance = Math.pow(10, -decimalPlaces);
        return Math.abs(num1 - num2) < tolerance;
    }
}
