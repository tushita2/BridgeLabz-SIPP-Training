package Practice_Sheet;

public class Simple_Interest {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("The simple interest for a principal amount of " + principal + 
                           ", rate of interest " + rate + "%, and time " + time + " years is: " + simpleInterest);
    }
}
