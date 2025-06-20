package PracticeSheet;

public class AreaOfCircle {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area =( Math.PI * radius * radius);
        
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        
    }
}
