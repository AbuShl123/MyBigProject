package CYDEO.days.day41_exceptions.season;

public class CheckingSeasons {
    public static void main(String[] args) {
        Winter winter = new Winter(16, -20);
        System.out.println(winter);
        winter.activity();

        Summer summer = new Summer(10, 34);
        System.out.println(summer);
        summer.activity();
    }
}
