package CYDEO.days.day41_exceptions.try_catch;

public class SecondTry {
    public static void main(String[] args) {


        try {
            int[] arr = {4,2,1,3};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
