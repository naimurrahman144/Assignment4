package capter5;

import java.util.Scanner;

class Grade1 {
    public static String getLetterGrade(double numberGrade) {
        if (numberGrade >= 3.85) {
            return "A";
        } else if (numberGrade >= 3.5) {
            return "A-";
        } else if (numberGrade >= 2.85) {
            return "B+";
        } else if (numberGrade >= 2.5) {
            return "B";
        } else if (numberGrade >= 2.15) {
            return "B-";
        } else if (numberGrade >= 1.5) {
            return "C+";
        } else if (numberGrade >= 1.15) {
            return "C";
        } else if (numberGrade >= 0.5) {
            return "D";
        } else {
            return "F";
        }
    }
}

public class GradeTranslation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number grade between 0 and 4: ");
        double numberGrade = scan.nextDouble();

        if (numberGrade >= 0 && numberGrade <= 4) {
            String letterGrade = Grade1.getLetterGrade(numberGrade);
            System.out.println("The closest letter grade is: " + letterGrade);
        } else {
            System.out.println("Invalid number grade. Please enter a number between 0 and 4.");
        }
    }
}
