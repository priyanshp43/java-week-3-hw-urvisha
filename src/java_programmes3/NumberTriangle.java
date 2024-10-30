package java_programmes3;

import java.util.Scanner;

/**
 * A program in Java to display the pattern like a triangle with a number.
 */

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the number of rows
        System.out.println("Input number of rows: ");
        int rows = scanner.nextInt();

        // Generate a triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //close the scanner
        scanner.close();
    }

}
