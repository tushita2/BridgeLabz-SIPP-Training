package Level1PracticePrograms;

import java.util.Scanner;

public class AreaOfTriangle {
      public static void main(String[] args) {
        final double INCH_TO_CM = 2.54;
        final int INCHES_IN_FOOT = 12;

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = sc.nextDouble();

        // Area calculation
        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * INCH_TO_CM * INCH_TO_CM;

        // Height conversions
        double heightInCm = height * INCH_TO_CM;
        int heightInFeet = (int)(height / INCHES_IN_FOOT);
        double remainingInches = height % INCHES_IN_FOOT;

        // Output
        System.out.println("\nArea of the triangle:");
        System.out.printf("-> %.2f square inches\n", areaInSqInches);
        System.out.printf("-> %.2f square centimeters\n", areaInSqCm);

        System.out.println("\nYour height is:");
        System.out.printf("-> In cm: %.2f cm\n", heightInCm);
        System.out.printf("-> In feet and inches: %d feet %.2f inches\n", heightInFeet, remainingInches);

        
    }
}


