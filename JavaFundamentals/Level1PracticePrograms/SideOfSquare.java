package Level1PracticePrograms;

import java.util.Scanner;

public class SideOfSquare {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculation: side = perimeter / 4
        double side = perimeter / 4;

        // Output
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);

        
    }
}
    

