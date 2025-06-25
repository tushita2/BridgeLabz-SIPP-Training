package ControlFlow.Level1;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close scanner
        sc.close();
    }
}
