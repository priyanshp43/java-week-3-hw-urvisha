package java_programmes3;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
    using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */


public class FirstAndLastDigitSum {


        public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Invalid value for negative numbers
        }

        int lastDigit = number % 10; // Extract the last digit

        int firstDigit = number; // Initialize firstDigit with the number itself
        while (firstDigit >= 10) {
            firstDigit /= 10; // Keep dividing by 10 to get the first digit
        }

        return firstDigit + lastDigit; // Return the sum of the first and last digit
    }

        public static void main(String[] args) {
        // Test cases
        System.out.println(sumFirstAndLastDigit(252));   // Should return 4 (2 + 2)
        System.out.println(sumFirstAndLastDigit(257));   // Should return 9 (2 + 7)
        System.out.println(sumFirstAndLastDigit(0));     // Should return 0 (0 + 0)
        System.out.println(sumFirstAndLastDigit(5));     // Should return 10 (5 + 5)
        System.out.println(sumFirstAndLastDigit(-10));   // Should return -1 (invalid)
    }


    }
