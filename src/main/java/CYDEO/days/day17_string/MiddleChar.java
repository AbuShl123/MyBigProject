package CYDEO.Days.day17_string;

import java.util.Scanner;

public class MiddleChar { // Elevator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length()%2==1) {
            System.out.println(s.charAt((s.length()/2)));
        } else {
            System.out.println(s.substring((s.length()/2)-1, (s.length()/2)+1));
        }
    }
}
