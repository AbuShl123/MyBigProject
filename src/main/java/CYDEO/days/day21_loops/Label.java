package CYDEO.Days.day21_loops;

public class Label {
    public static void main(String[] args) {
        outer: for (int f = 0; f < 9; f++) {
            System.out.println("do something");
            inner: for (int i = 0; i < 7; i++) {
                System.out.println("do something too");
                other: for (int j = 0; j < 23; j++) {
                    System.out.println("j");
                }
            }
        }
    }
}
