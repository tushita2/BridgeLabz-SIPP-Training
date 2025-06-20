package Day1_JavaFundamentals;

public class FindTheAge {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int birthYear = 2000;
        int currentYear = 2024 ;
        int age = currentYear - birthYear;
        
        System.out.println("Harry's age in: " +currentYear +" is " + age );
    }
}
