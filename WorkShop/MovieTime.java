package WorkShop;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieTime {
    static class Show {
        String name;
        int time; 
        Show(String name, int time) {
            this.name = name;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        ArrayList<Show> shows = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of shows: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter show name: ");
            String name = sc.nextLine();
            System.out.print("Enter show time (e.g., 1330 for 1:30 PM): ");
            int time = sc.nextInt();
            sc.nextLine();

            Show newShow = new Show(name, time);
            insertSorted(shows, newShow);
        }

        System.out.println("\nSorted Showtimes:");
        for (Show s : shows) {
            System.out.println(s.name + " - " + formatTime(s.time));
        }
    }

    
    public static void insertSorted(ArrayList<Show> shows, Show newShow) {
        int i = 0;
        while (i < shows.size() && shows.get(i).time < newShow.time) {
            i++;
        }
        shows.add(i, newShow);
    }

  
    public static String formatTime(int time) {
        return String.format("%02d:%02d", time / 100, time % 100);
    }
}
