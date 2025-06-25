package JavaFundamentals.Level2PracticePrograms;
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Print results
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f\n", distanceInYards, distanceInMiles);

        // Close the scanner
        sc.close();
    }
}


