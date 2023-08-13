package capter5;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter three numbers: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        double largestNumber = 0;
        if(num1 >= num2 && num1 >=num3){
            largestNumber = num1;
        }
        else if(num2 >= num3 && num2 >=num1){
            largestNumber = num2;
        }
        else{
            largestNumber = num3;
        }

        System.out.println("The largest number is " + largestNumber);
    }
}
