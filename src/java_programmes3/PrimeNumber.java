package java_programmes3;

import java.util.Scanner;

/**
 * A programme to input any number and check if it is prime or not.
 */


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // check if the number is prime and print the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");

        }

        // Close the scanner

        scanner.close();
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        // Handle numbers less than or equal to 1
        if (number<=1){
            return false;

        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i< Math.sqrt(number); i++){
            if (number% i == 0){
                return false;   //Number is divisible by i , hence not prime
            }

        }

        return true; // Number is prime
    }

    }

