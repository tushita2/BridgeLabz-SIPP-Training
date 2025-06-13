//Add Two Numbers
package PracticeSheet;

public class SumOfTwo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        
    }
    
}
