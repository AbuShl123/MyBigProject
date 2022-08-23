package CYDEO.Days.day18_loops;

public class EvenAndOdd {
    public static void main(String[] args) {
        int limit = 100;
        int count = 1;

        // printing all the even numbers

        while (count <= limit) {
            if (count % 2 == 0) System.out.print(count + " ");
            count++;
        }
        
        //printing all odd numbers but in backwards direction
        System.out.println();

        while (limit >= 1) {
            if (limit % 2 == 1) System.out.print(limit + " ");
            limit--;
        }
    }
}
