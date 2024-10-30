package java_programmes3;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops.
 */


public class RightAngleTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Ask user to enter a number of rows
        System.out.println("Enter number of rows");
        int rows = scanner.nextInt();

        // Generate the triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();

        }


            // Close the scanner
            scanner.close();
        }

    }

