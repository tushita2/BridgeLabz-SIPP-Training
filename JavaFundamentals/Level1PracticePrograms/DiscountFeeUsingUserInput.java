package Level1PracticePrograms;

import java.util.Scanner;

public class DiscountFeeUsingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the original fee :");
        double originalFee= scanner.nextDouble();
        System.out.println("Enter the discount percentage :");
        double discountPercentage = scanner.nextDouble();
        // Calculate the discount amount
        double discountAmount = (originalFee * discountPercentage) / 100;

        // Calculate the final fee after applying the discount
        double finalFee = originalFee - discountAmount;

        // Print the final fee
        System.out.println("The final fee after applying a " + discountPercentage + "% discount is: " + finalFee);
    }
}
