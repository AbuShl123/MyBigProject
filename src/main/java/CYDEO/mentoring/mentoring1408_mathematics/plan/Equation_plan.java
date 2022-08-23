package CYDEO.mentoring.mentoring1408_mathematics.plan;

import java.util.ArrayList;

public class Equation_plan {
    public static int solveEquation(String str) {
        str = getVariableX(str);
        int a = Math_plan.solve(str.substring(str.indexOf('=')+1));
        return str.startsWith("-") ? a*(-1) : a;
    }

    public static String getVariableX(String str) { //  12 - x = 5
        String formula;
        str = str.replace(" ", "");
        // 12-x=5
        ArrayList<String> arr = Math_plan.getEachVariable(str.substring(0,str.indexOf('=')));
        arr.add(str.substring(str.indexOf('=')+1));
        // [12, -x, 5]
        boolean isXFirst = arr.indexOf("+x") == 0 || arr.indexOf("-x") == 0;
        arr.set(0, arr.get(0).substring(1));
        char v = '-';
        if (isXFirst) {
            if (arr.get(1).contains("-")) v = '+';
            formula = arr.get(0) + "=" + arr.get(2) + v + arr.get(1).substring(1);
        } else {
            if (arr.get(0).contains("-")) v = '+';
            formula = arr.get(1) + "=" + arr.get(2) + v + arr.get(0).substring(1);
        }
        return formula.startsWith("+") ? formula.substring(1) : formula;
    }
    /*
    public static int solveEquation(String str) { // x-5=10
        int x;
        str = str.replace(" ", ""); // removing all spaces
        int m = Integer.parseInt(str.substring(str.indexOf("=")+1));
        char ch;
        if (str.contains("+")) {
            ch = '+';
        }
        else {
            ch = '-';
        }
        String s1 = str.substring(0, str.indexOf(ch));
        String s2 = str.substring(str.indexOf(ch)+1, str.indexOf('='));
        if (ch == '-') {
            if (s1.equals("x")) {
                x = Integer.parseInt(s2) + m;
            } else {
                x = Integer.parseInt(s1) - m;
            }
        } else {
            if (s1.equals("x")) {
                x = m - Integer.parseInt(s2);
            } else {
                x = m - Integer.parseInt(s1);
            }
        }
        return x;
    }
     */

}
