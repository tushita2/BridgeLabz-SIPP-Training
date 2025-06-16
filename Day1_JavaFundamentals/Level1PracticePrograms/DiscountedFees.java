package Level1PracticePrograms;

public class DiscountedFees {
    public static void main(String[] args) {
        double Fee = 125000.0; 
        double discountRate = 0.10; 
        double discountedAmount= Fee * discountRate; 
        double discountedFees = Fee - discountedAmount;
        
        System.out.println("The discounted amount is INR: " +discountedAmount +"and final discounted fee is INR " +discountedFees);
    }
}
