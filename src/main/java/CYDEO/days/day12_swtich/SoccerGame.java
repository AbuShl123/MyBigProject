package CYDEO.days.day12_swtich;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();

        if (minutes > 0 && minutes <=90) {
            if (minutes >= 75) System.out.println("just getting started");
            else if (minutes >= 60) System.out.println("players are doing their best");
            else if (minutes >= 39) System.out.println("middle of the game is going great");
            else System.out.println("the end of the game is approaching");

        } else if (minutes < 0) System.out.println("minutes cannot be a negative number");
          else System.out.println("games cannot be longer than 90 minutes");

    }
}
