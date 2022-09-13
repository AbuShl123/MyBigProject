package CYDEO.days.day43_abstraction.language;

public class English implements Language {
    @Override
    public void hello() {
        System.out.print("Hello ");
    }

    @Override
    public void bye() {
        System.out.print("Bye ");
    }
}
