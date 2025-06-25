package JavaFundamentals.Level2PracticePrograms;
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Check if second number is not zero to avoid division by zero
        if (number2 != 0) {
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Display result
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                               " of two number " + number1 + " and " + number2);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Close scanner
        sc.close();
    }
}


