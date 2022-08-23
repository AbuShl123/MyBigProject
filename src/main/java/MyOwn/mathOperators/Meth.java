package MyOwn.mathOperators;


import java.util.ArrayList;

public class Meth {
    public String solvingBrackets(String str) { // str =  (23-3)+(32-1)+(12+4+110)-(23+44) = 20+31+136-67 = 0
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

    public ArrayList<Double> findNum(String str) { // str = "20+31+136-67";  a = {20, 31, 136, -67}
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

    public double mathOpWithArr(ArrayList<Double> a) { // []a = {20, 31, 136, -67};
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
}
