package java_programmes3;

/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
   names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.

 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.
 */


public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    // Method to get the first number
    public double getFirstNumber() {
        return firstNumber;
    }

    // Method to get the second number
    public double getSecondNumber() {
        return secondNumber;
    }

    // Method to set the first number
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Method to set the second number
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }


    // Method to get the result of addition
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // Method to get the result of subtraction
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // Method to get the result of multiplication
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // Method to get the result of division
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;

    }


    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult()); // add= 9.0
        System.out.println("subtract= " + calculator.getSubtractionResult()); // subtract= 1.0

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult()); // multiply= 0.0
        System.out.println("divide= " + calculator.getDivisionResult()); // divide= 0.0
    }
}


