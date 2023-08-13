package capter5;

import java.util.Scanner;

class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int compareTo(Time other) {
        if (this.hour < other.hour) {
            return -1;
        } else if (this.hour > other.hour) {
            return 1;
        } else {
            if (this.minute < other.minute) {
                return -1;
            } else if (this.minute > other.minute) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

public class TimeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first time (hour minute): ");
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        Time time1 = new Time(hour1, minute1);

        System.out.println("Enter the second time (hour minute): ");
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        Time time2 = new Time(hour2, minute2);

        int comparisonResult = time1.compareTo(time2);

        if (comparisonResult < 0) {
            System.out.println("Time 1 comes first.");
        } else if (comparisonResult > 0) {
            System.out.println("Time 2 comes first.");
        } else {
            System.out.println("Time 1 and Time 2 are the same.");
        }

        System.out.println("First time: " + hour1 + ":" + minute1);
        System.out.println("Second time: " + hour2 + ":" + minute2);
    }
}
