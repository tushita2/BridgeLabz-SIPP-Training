package JavaFundamentals.Level2PracticePrograms;
import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " 
                           + quantity + " and unit price is INR " + unitPrice);

        // Close scanner
        sc.close();
    }
}


