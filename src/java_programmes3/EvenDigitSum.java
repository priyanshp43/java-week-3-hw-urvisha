package java_programmes3;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */


public class EvenDigitSum {
    public  static int getEvenDigitSum(int number){
        if (number < 0){
            return -1; // Invalid value for negative numbers
        }

        int sum = 0;
        while (number > 0){
            int digit = number % 10; //Extract the last digit
            if (digit % 2 == 0){
                sum += digit;
            }
            number/=10;  // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456));   // Should return 12 (2+4+6)
        System.out.println(getEvenDigitSum(-123456));   // Should return -1 (2+4+6)
        System.out.println(getEvenDigitSum(24680));   // Should return 20 (2+4+6+8+0)
    }



}
