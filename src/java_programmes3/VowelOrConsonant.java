package java_programmes3;

import java.util.Scanner;

/**
 * program that takes the user to provide a single character from the
   alphabet. Print Vowel of Consonant, depending on the user input. If the user input
   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
   error message.
 */

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a single character
        System.out.println("Input an alphabet: ");
        String input =scanner.nextLine();

        // Check if the input is single character and a letter
        if (input.length() == 1 && Character.isLetter(input.charAt(0))){
        char ch = input.charAt(0);


        // check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Input letter is vowel");
            }else
                System.out.println("Input letter is Consonant");
        } else{
            System.out.println("Error: Invalid input. Please enter a single alphabet.");
        }

        // close the scanner
        scanner.close();


    }
}
