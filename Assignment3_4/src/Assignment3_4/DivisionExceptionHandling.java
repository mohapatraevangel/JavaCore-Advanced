package Assignment3_4;

import java.util.Scanner;

public class DivisionExceptionHandling {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input two integers
        System.out.print("Enter the 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            // Try to perform division
            int quotient = a / b;
            System.out.println("The quotient of " + a + "/" + b + " = " + quotient);
        } catch (ArithmeticException e) {
            // Catch divide by zero error
            System.out.println("DivideByZeroException caught");
        } finally {
            // The finally block is always executed
            System.out.println("Inside finally block");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
