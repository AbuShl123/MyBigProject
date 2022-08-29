package MyOwn.mathOperators;


import java.util.ArrayList;

public final class Meth { // utility class
    public static String solvingBrackets(String str) { // str =  (23-3)+(32-1)+(12+4+110)-(23+44) = 20+31+136-67 = 0
        str = str.replace(" ", "");
        String[] a = str.split("[()]");
        if (a.length <= 1) return str;
        for (int i = 1; i < a.length; i+=2) {
            a[i] = "" + mathOpWithArr(findNum(a[i]));
        }
        StringBuilder keyStr = new StringBuilder();
        for (String s : a) {
            keyStr.append(s);
        }
        return keyStr.toString();
    }

    public static ArrayList<Double> findNum(String str) { // str = "20+31+136-67";  a = {20, 31, 136, -67}
        StringBuilder n = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-' || str.charAt(i) == '+')
                n.append(" ");
            n.append(str.charAt(i));
        }
        ArrayList<Double> a = new ArrayList<>();
        for (String v : n.toString().trim().split(" ")) {
            a.add(Double.parseDouble(v));
        }
        return a;
    }

    public static double mathOpWithArr(ArrayList<Double> a) { // []a = {20, 31, 136, -67};
        double answer = 0;
        for (double num : a) {
            answer += num;
        }
        return answer;
    }

    public static double solveMath(String str) {
        Meth obj = new Meth();
        return obj.mathOpWithArr(obj.findNum(obj.solvingBrackets(str)));
    }

    public static int solveExample(String[] numbers) {
        int answer = 0;
        for (String each : numbers) {
            answer += Integer.parseInt(each);
        }
        return answer;
    }

    public static int solveExample(String str) {
        String[] numbers = getNumbers(str);
        int answer = 0;
        for (String each : numbers) {
            answer += Integer.parseInt(each);
        }
        return answer;
    }

    public static String[] getNumbers(String example) { // example: "12-10+5-2+30"
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < example.length(); i++) {
            char c = example.charAt(i);
            if (c == '=') {
                if (example.charAt(i+1) == '-') {
                    result.append(" -");
                    i++;
                    continue;
                }
                result.append(" "); continue;
            }
            if (c == '+') {
                result.append(" "); continue;
            } else if ( c == '-') {
                result.append(" ");
            }
            result.append(c);
        }
        return result.toString().trim().split(" ");
    }

    public static int solveEquation(String str) { // -5+x=15
        String formula = getEquationFormula(str);
        String[] n = getNumbers(formula.substring(formula.indexOf('=')+1));

        int x = solveExample(n);
        return formula.startsWith("-") ? x*(-1) : x;
    }

    public static String getEquationFormula(String str) { // str: -5 + x = 15 --> x = 15 +5
        String[] parts = getNumbers(str);
        String x;
        String v;
        if (parts[0].equals("x") || parts[0].equals("-x")) {
            x = parts[0];
            v = parts[1];
        } else  {
            x = parts[1];
            v = parts[0];
        }
        if (v.contains("-")) v = "+" + v.substring(1); // -5 --> +5
        else v = "-" + v;
        return x + "=" + parts[2] + v;
    }
}
