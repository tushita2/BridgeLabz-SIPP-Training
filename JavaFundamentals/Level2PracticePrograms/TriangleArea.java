package JavaFundamentals.Level2PracticePrograms;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Input base and height in centimeters
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();

        // Calculate area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert area to square inches (1 inch = 2.54 cm, so 1 sq in = 2.54^2 = 6.4516 sq cm)
        double areaSqIn = areaSqCm / 6.4516;

        // Print the result
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaSqIn, areaSqCm);

        // Close the scanner
        sc.close();
    }
}
