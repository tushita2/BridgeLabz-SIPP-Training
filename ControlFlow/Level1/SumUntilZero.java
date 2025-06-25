package ControlFlow.Level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        double total = 0.0;  // Initialize total
        double number;       // Variable to hold user input

        // Prompt and take input
        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        // Loop until user enters 0
        while (number != 0) {
            total += number;  // Add input to total
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
        }

        // Output the total
        System.out.println("The total sum is: " + total);

        // Close the scanner
        sc.close();
    }
}
