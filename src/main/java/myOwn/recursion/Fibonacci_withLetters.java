package myOwn.recursion;

public class Fibonacci_withLetters {

    static String a;
    static String b;
    static String c;
    static String letters(int n, String[] arr) {
        if (a == null) {
            a = arr[0];
            b = arr[1];
        }
        if (n > 0) {
            c = b + a;
            a = b;
            b = c;
            return c + " " + letters(n - 1, arr);
        }
        return "";
    }
     /*
    static int c = 2;
    static String str = "";
     static String Letters(int n, String[] s) {
        if (c == n-1) {
            str += s[c - 1] + s[c - 2];
        } else {
            s[c] = s[c - 1] + s[c - 2];
            str += s[c++] + ", " + Letters(n, s);
        }
        return s[0] + ", " + s[1] + ", " + str;
    }

        return s[5-1] + ", " + return s[4-1] + ", " + return s[3-1] + ", " + return[2-1] + ", " + return[0]
     */
    public static void main(String[] args) {
        int n = 6;
        String[] str = new String[2];
        str[0] = "k";
        str[1] = "t";
        //  0 1 1 2 3 5 8 ...
        //  k t tk tkt tkttk tkttktkt
        String a = letters(n, str);
        System.out.println(a);
        System.out.println(a.split(" ")[a.split(" ").length - 1].length());
    }
}
