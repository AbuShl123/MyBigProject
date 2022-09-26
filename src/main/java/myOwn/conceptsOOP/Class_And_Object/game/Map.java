package myOwn.conceptsOOP.Class_And_Object.game;

import java.util.Scanner;
import static myOwn.classRECOURSE.*;

public class Map {
    public static void main(String[] args) {
        Hero user;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println(YELLOW_BRIGHT + "Welcome to the Exciting Adventure Game!");

        System.out.println("What character would you like to play for?");
        System.out.println("1) - Steve");
        System.out.println("2) - Alex");
        s = sc.next();
        if (s.equals("1")) {
            user = Hero.Steve();
        }else {
            user = Hero.Alex();
        }

    }
}
