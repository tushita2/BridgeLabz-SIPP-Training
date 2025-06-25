package ControlFlow.Level1;

public class SpringSeason {
    public static void main(String[] args) {
        // Check if command line arguments are passed
        if (args.length < 2) {
            System.out.println("Please provide both month and day as command line arguments.");
            return;
        }

        // Parse month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if date is in spring season (March 20 to June 20)
        boolean isSpring =
            (month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20);

        // Output result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
