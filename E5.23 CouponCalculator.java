package capter5;

import java.util.Scanner;

public class CouponCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount spent on groceries: $");
        double amountSpent = scanner.nextDouble();

        scanner.close();

        double couponAmount = calculateCoupon(amountSpent);

        if (couponAmount == 0) {
            System.out.println("No coupon");
        } else {
            System.out.println("Coupon amount: $" + couponAmount);
        }
    }

    public static double calculateCoupon(double amountSpent) {
        if (amountSpent < 10) {
            return 0;
        } else if (amountSpent <= 60) {
            return amountSpent * 0.08;
        } else if (amountSpent <= 150) {
            return amountSpent * 0.10;
        } else if (amountSpent <= 210) {
            return amountSpent * 0.12;
        } else {
            return amountSpent * 0.14;
        }
    }

}
