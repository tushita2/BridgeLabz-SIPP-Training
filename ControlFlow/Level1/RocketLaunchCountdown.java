package ControlFlow.Level1;

import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take countdown start value from user
        System.out.print("Enter the starting number for countdown: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

        // Final message
        System.out.println("Lift Off! 🚀");

        // Close scanner
        sc.close();
    }
}
