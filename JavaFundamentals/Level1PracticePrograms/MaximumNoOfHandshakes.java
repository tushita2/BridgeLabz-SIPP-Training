package Level1PracticePrograms;

import java.util.Scanner;

public class MaximumNoOfHandshakes {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double n = Sc.nextDouble(); // Example number of people
        double handshakes = (n * (n - 1)) / 2; // Formula to calculate maximum handshakes
        System.out.println("Maximum number of handshakes among " + n + " people is: " + handshakes);
    }
}
