package practicesheet_1;

public class Ques_1{
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        
        System.out.print("Enter your Distance: ");
        
        int dist = scanner.nextInt();
        double miles=dist*1.6;
        
        System.out.println("The distance" +dist +"km in miles is: " + miles);

}
}