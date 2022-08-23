package CYDEO.Days.day20_loops;

import java.util.Scanner;

public class MultipleEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            str += str.charAt(str.length()-1);
        }
        System.out.println(str);
    }
}
