package CYDEO.days.day09_if_statement;

public class Outside { // dead inside
    public static void main(String[] args) {
        double degree = 80;

        if (degree >= 72) {
            System.out.println("It's nice, go outside");
        }

        if (degree < 72) {
            System.out.println("Stay inside, code some java");
        }

        // as if else

        if ( degree >= 72) {
            System.out.println("It's nice, go outside");
        } else {
            System.out.println("Stay inside, code some java");
        }

        double hourlyRate = 40;
        int hoursPerWeek = 60;


    }
}
