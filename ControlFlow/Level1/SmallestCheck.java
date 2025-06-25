package ControlFlow.Level1;
import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Check if the first number is the smallest
        boolean isSmallest = number1 < number2 && number1 < number3;

        // Output the result
        System.out.println("Is the first number the smallest? :" + isSmallest);

        // Close scanner
        sc.close();
    }
}


