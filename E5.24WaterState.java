package capter5;

import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter 'C' for Celsius or 'F' for Fahrenheit: ");
        char scale = scanner.next().charAt(0);

        if (scale == 'C' || scale == 'c') {
            temperature = celsiusToFahrenheit(temperature);
        }

        if (temperature >= 100) {
            System.out.println("Water is in a gaseous state (steam) at " + temperature + " degrees.");
        } else if (temperature <= 0) {
            System.out.println("Water is in a solid state (ice) at " + temperature + " degrees.");
        } else {
            System.out.println("Water is in a liquid state at " + temperature + " degrees.");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
