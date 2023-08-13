package capter5;

import java.util.Scanner;

public class TimeCompared {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first time (hour minute): ");
        int hour1 = scan.nextInt();
        int minute1 = scan.nextInt();

        System.out.println("Enter the second time (hour minute): ");
        int hour2 = scan.nextInt();
        int minute2 = scan.nextInt();

        if (hour1 < hour2) {
            System.out.println("Time 1 comes first.");
        }
        else if (hour1 == hour2) {
            if (minute1 < minute2) {
                System.out.println("Time 1 comes first.");
            }
            else if (minute1 == minute2) {
                System.out.println("Time 1 and Time 2 are the same.");
            }
            else {
            System.out.println("Time 2 comes first.");
            }
        }
        else {
            System.out.println("Time 2 comes first.");
        }
    }
}
