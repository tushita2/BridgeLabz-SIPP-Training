package JavaFundamentals.Level2PracticePrograms;
import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take user input for a, b, and c as double
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Perform double operations
        double result1 = a + b * c;       // Multiplication before addition
        double result2 = a * b + c;       // Multiplication before addition
        double result3 = c + a / b;       // Division before addition
        double result4 = a % b + c;       // Modulus before addition

        // Print the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        // Close scanner
        sc.close();
    }
}

 
