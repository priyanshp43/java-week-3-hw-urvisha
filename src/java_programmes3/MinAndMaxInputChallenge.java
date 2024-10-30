package java_programmes3;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * Before the user enters the number, print the message Enter number:
 * If the user enters an invalid number, break out of the loop and print the minimum and maximum
    number.
 * Hint:
 * Use an endless while loop.
 * Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        while (true){
            System.out.println("Enter number:");

            if (scanner.hasNextInt()){
                int number = scanner.nextInt();

                if (number > max){
                    max = number;
            }

                if (number < min){
                    min = number;
                }
            } else {
                System.out.println("Invalid number.");
                break;
            }

            // clear invalid input
            scanner.nextLine();
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);

        // close the scanner
        scanner.close();

    }
}
