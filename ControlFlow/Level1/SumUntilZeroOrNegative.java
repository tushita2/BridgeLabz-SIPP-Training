package ControlFlow.Level1;
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        double total = 0.0; // Initialize total

        while (true) {
            // Take input from the user
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            // Check for termination condition
            if (number <= 0) {
                break; // Exit loop if 0 or negative
            }

            // Add to total
            total += number;
        }

        // Print final total
        System.out.println("The total sum is: " + total);

        // Close scanner
        sc.close();
    }
}


