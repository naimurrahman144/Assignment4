package capter5;

import java.util.Scanner;

public class VowelConsonentCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a single character from the alphabet: ");
        String input = scan.nextLine();

        scan.close();

        input = input.toUpperCase();

        if (input.length() != 1) {
            System.out.println("Error: Please enter a single character.");
        }
        else {
            char character = input.charAt(0);

            if ((character >= 'A' && character <= 'Z')) {
                if (isVowel(character)) {
                    System.out.println("Vowel");
                }
                else {
                    System.out.println("Consonant");
                }
            }
            else {
                System.out.println("Error: Please enter a valid character from the alphabet.");
            }
        }
    }
    public static boolean isVowel(char character) {
        return character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
    }
}
