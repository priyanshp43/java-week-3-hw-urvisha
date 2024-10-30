package java_programmes3;

/**
 * Java program to print the Fibonacci sequence up to a specific number of terms
 */

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 8;  // Number of terms to print
        int firstTerm = 1, secondTerm = 1;

        System.out.println("Fibonacci Sequence: " + firstTerm + " " + secondTerm);

        for (int i = 3; i<=n ; i++){
            int nextTerm = firstTerm + secondTerm;
            System.out.println(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
