package ControlFlow.Level1;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check divisibility by 5
        boolean isDivisible = number % 5 == 0;

        // Print result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close scanner
        sc.close();
    }
}
