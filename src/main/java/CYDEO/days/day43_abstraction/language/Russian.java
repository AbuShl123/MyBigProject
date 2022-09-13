package CYDEO.days.day43_abstraction.language;

public class Russian implements Language{

    @Override
    public void hello() {
        System.out.print("Привет ");
    }

    @Override
    public void bye() {
        System.out.print("Пока ");
    }
}
