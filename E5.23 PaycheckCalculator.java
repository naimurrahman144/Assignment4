package capter5;

import java.util.Scanner;

class Paycheck {
    private String employeeName;
    private double hourlyWage;
    private double hoursWorked;

    public Paycheck(String employeeName, double hourlyWage, double hoursWorked) {
        this.employeeName = employeeName;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        double regularPay = Math.min(hoursWorked, 40) * hourlyWage;
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double overtimePay = overtimeHours * hourlyWage * 1.5;

        return regularPay + overtimePay;
    }

    public void printPaycheck() {
        double payAmount = calculatePay();
        System.out.println("Paycheck for " + employeeName);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly wage: $" + hourlyWage);
        System.out.println("Regular pay: $" + Math.min(hoursWorked, 40) * hourlyWage);
        System.out.println("Overtime pay: $" + (Math.max(0, hoursWorked - 40) * hourlyWage * 1.5));
        System.out.println("Total pay: $" + payAmount);
    }
}

public class PaycheckCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        Paycheck paycheck = new Paycheck(employeeName, hourlyWage, hoursWorked);
        paycheck.printPaycheck();
    }
}
