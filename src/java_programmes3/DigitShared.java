package java_programmes3;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
   within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
   otherwise, the method should return false.
 * NOTE: The method hasSharedDigit should be defined as public static
 */


public class DigitShared {
    // Method to check if two numbers have a shared digit
    public static boolean hasSharedDigit(int number1, int number2) {
        // Check if the numbers are within the valid range
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        // Extract digits of the first number
        int firstNumberLastDigit = number1 % 10;
        int firstNumberFirstDigit = number1 / 10;

        // Extract digits of the second number
        int secondNumberLastDigit = number2 % 10;
        int secondNumberFirstDigit = number2 / 10;

        // Check if there's a shared digit
        return (firstNumberFirstDigit == secondNumberFirstDigit ||
                firstNumberFirstDigit == secondNumberLastDigit ||
                firstNumberLastDigit == secondNumberFirstDigit ||
                firstNumberLastDigit == secondNumberLastDigit);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasSharedDigit(12, 23)); // Should return true
        System.out.println(hasSharedDigit(9, 99));  // Should return false
        System.out.println(hasSharedDigit(15, 55)); // Should return true
    }
}



