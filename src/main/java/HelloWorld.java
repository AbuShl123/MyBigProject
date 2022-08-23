import java.util.*;
import java.util.stream.Collectors;

public class HelloWorld {

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
        String result = "";
        for (int i = 0; i < example.length(); i++) {
            char c = example.charAt(i);
            if (c == '=') {
                if (example.charAt(i+1) == '-') {
                    result += " -";
                    i++;
                    continue;
                }
                result += " "; continue;
            }
            if (c == '+') {
                result += " "; continue;
            } else if ( c == '-') {
                result += " ";
            }
            result += c;
        }
        return result.trim().split(" ");
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

    public static void main(String[] args) {
        System.out.println(solveExample(new String[]{"10", "-2", "9", "-4", "-7", "7"}));


        String example = "12-10+5-2+30"; // 35
        System.out.println(solveExample(example));

        System.out.println(Arrays.toString(getNumbers("-23+x=-20")));
        System.out.println(getEquationFormula("-23+x=-20"));
        System.out.println(solveEquation("-23+x=-20"));
    }
}

