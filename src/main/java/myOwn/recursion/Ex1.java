package myOwn.recursion;

import java.util.Scanner;

public class Ex1 {
    static int a = 0;
    static String s = "";
    static String num(String str) { // madam
        a++;
        if (a <= str.length()) {
            s += str.charAt(str.length()-a);
            num(str);
        }
        return s;// madam
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        num(str);
        System.out.println(num(str).equals(str));
    }
}
