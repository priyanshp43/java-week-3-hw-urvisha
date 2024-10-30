package java_programmes3;

import java.util.Scanner;

/**
 * a program in Java to display the pattern like a diamond.
 * Using a While loop.
 */


public class DiamondPattern {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the diamond
        System.out.print("Enter the number of rows for the diamond pattern: ");
        int rows = scanner.nextInt();

        int i = 1; // Initialize the counter

        // Upper part of the diamond
        while (i <= rows) {
            int j = 1;
            // Print leading spaces
            while (j <= rows - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            // Print stars
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        i = rows - 1; // Reinitialize the counter for the lower part

        // Lower part of the diamond
        while (i > 0) {
            int j = 1;
            // Print leading spaces
            while (j <= rows - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            // Print stars
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        // Close the scanner
        scanner.close();
    }
    }



