package CYDEO.mentoring.mentoring1408_mathematics.real;

public class MyMath {

    // String str = "12+23-10+90";
    // output --> 105

    public static int solveExample(String[] str) {
        int result = 0;
        for (String each : str) {
            result += Integer.parseInt(each); // transforming each value from array str to int
        }
        return result;
    }

    public static int solveExample(String str) {
        String[] arr = getEachNumber(str);
        int result = 0;
        for (String v : arr) {
            result += Integer.parseInt(v);
        }
        return result;
    }

    public static String[] getEachNumber(String str) {
        String numbers = "";
        // str = "12+10-9"
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '+' || c == '-') {
                numbers += " ";
            }
            numbers += c;
        }
        // numbers = "12 +10 -9"
        return numbers.split(" ");
    }



    public static void main(String[] args) {
        System.out.println(solveExample(new String[]{"10", "-5", "9", "1"}));
        // 10 + (-5) + 9 + 1 = 15
        // print = 15

        // String str = "10-5+9+1";
        // output --> 15
        System.out.println(solveExample("10-5+9+1"));

        System.out.println(solveExample("9+9"));
        System.out.println(solveExample("9+9-10+2-9+7+5+4-1"));
    }
}
