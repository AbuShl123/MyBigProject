package CYDEO.days.day43_abstraction.language;

public class Speaking {
    public static void main(String[] args) {
        English english = new English();
        Russian russian = new Russian();
        Spanish spanish = new Spanish();

        english.hello(); english.bye();
        System.out.println();
        russian.hello(); russian.bye();
        System.out.println();
        spanish.hello(); spanish.bye();


    }
}
