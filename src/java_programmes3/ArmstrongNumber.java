package java_programmes3;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 */


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Ask user to enter a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to check  if the number is an Armstrong number
        boolean result = isArmstrongNumber(number);

        //Print the result
        if (result){
            System.out.println(number + " is an Armstrong number. ");
        } else{
            System.out.println(" is not an Armstrong number. ");
        }

        // close the scanner
        scanner.close();
    }


    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);  // For a 3-digit Armstrong number
            number /= 10;
        }

        return sum == originalNumber;
    }

}
