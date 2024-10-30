package java_programmes3;

public class PalindromeNumber {

    // Method to check if number is palindrome
    public  static  boolean isPalindrome(int number){
        int originalNumber = number;
        int reverse = 0;

        // Handle negative numbers by converting them to positive for comparison
        number = Math.abs(number);

        while(number > 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
          return originalNumber == reverse || originalNumber == -reverse;

    }

    public static void main(String[] args) {
        // Test cases

        System.out.println("isPalindrome(-1221) = " + isPalindrome(-1221));  // Should return true
        System.out.println("isPalindrome(707) = " + isPalindrome(707));  // Should return true
        System.out.println("isPalindrome(11212) = " + isPalindrome(11212));  // Should return false
    }
}
