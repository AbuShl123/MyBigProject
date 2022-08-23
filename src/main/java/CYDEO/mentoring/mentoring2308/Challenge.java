package CYDEO.mentoring.mentoring2308;

import java.util.*;

public class Challenge {

    public static int warOfNumbers(int[] numbers) {
        int ev = 0;
        int od = 0;
        for (int i : numbers) {
            if (i%2 == 0) ev += i;
            else od += i;
        }
        return Math.abs(ev - od);
    }

    public static int countLetter(char[][] arr, char letter) {
        ArrayList<Character> list = new ArrayList<>();
        for (char[] v : arr) {
            for (char e : v) {
                list.add(e);
            }
        }
        list.removeIf(e -> !e.equals(letter));
        return list.size();
    }

    public static int[][] makeSquare(int n) {
        int[][] arr = new int[n][n];
        /*
         [
          [], [], [], [], []
         ]
         */
        for (int[] v : arr) {
            Arrays.fill(v, n);
        }
        return arr;
    }

    public static String rps(String s1, String s2) {
        if(s1.equals(s2)) return "TIE";
        return "";
    }

    public static Object basicCalculator(int a, char o, int b) {
        int result;
        switch (o) {
            case '+' :
                result = a + b; break;
            case '-' :
                result = a - b; break;
            case '*' :
                result = a * b; break;
            case '/' :
                if (b != 0) {
                    result = a / b;
                    break;
                }
            default:
                return null;
        }
        return result;
    }

    public static boolean validateEmail(String s) {
        return s.indexOf('@') > 0 && s.indexOf('.') > s.indexOf('@');
    }

    public static int spinAround(String[] turns) {
        int a = 0;
        for (String v : turns) {
            if (v.equals("right"))
                a += 90;
            else
                a+= -90;
        }
        return Math.abs(a/360);
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println(Arrays.toString(a));
        System.out.println("---------------");
        Arrays.fill(a, 8);
        System.out.println(Arrays.toString(a));


        int[][] arr = new int[5][5];
        System.out.println(Arrays.deepToString(arr));
        for (int[] v : arr) {
            Arrays.fill(v, 5);
        }
        for (int[] t : makeSquare(3)) {
            System.out.println(Arrays.toString(t));
        }


        System.out.println(basicCalculator(120, '/', 0));

        System.out.println(validateEmail("abu@gmail.com"));

        System.out.println(spinAround(new String[] {"left", "left", "left", "left"}));
    }
}
