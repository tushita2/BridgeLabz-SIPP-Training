package PracticeSheet;

public class PowerCalculation {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        
        double power = Math.pow(base, exponent);
        
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + power);
    }
}
