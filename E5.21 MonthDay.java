package capter5;

import java.util.Scanner;

public class MonthDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a month (1 for January, 2 for February, etc.): ");
        int month = scanner.nextInt();


        scanner.close();


        int days;
        switch (month) {
            case 2:
                days = 28;
                System.out.println("February has " + days + " days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println("Month " + month + " has " + days + " days.");
                break;
            default:
                days = 31;
                System.out.println("Month " + month + " has " + days + " days.");
        }
    }
}
