package CYDEO.Days.day21_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 17; i++) {
            System.out.println("Table for " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
