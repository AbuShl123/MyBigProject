package CYDEO.Days.day22_array;

public class Exs_1 {
    public static void main(String[] args) {
        num(10);
    }

    public static int num(int a) {
        a--;
        if (a == 0) return 0;
        return num(a);
    }
}
