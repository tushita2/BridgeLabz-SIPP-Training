package Level1PracticePrograms;

import java.util.Scanner;

public class CentimeterToFeetAndInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        double centimeters = scanner.nextDouble(); // Read height in centimeters

   
        double inches = centimeters / 2.54; // Conversion factor from centimeters to inches 
        double feet = inches / 12; // Conversion from inches to feet
        double remainingInches = inches % 12; // Remaining inches after converting to feet
        System.out.printf("%.2f centimeters is equal to %.0f feet and %.2f inches.%n", centimeters, feet, remainingInches);
    }
}
