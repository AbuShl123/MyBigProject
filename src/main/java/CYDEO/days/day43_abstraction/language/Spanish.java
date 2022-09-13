package CYDEO.days.day43_abstraction.language;

public class Spanish implements Language{
    @Override
    public void hello() {
        System.out.print("Hola ");
    }

    @Override
    public void bye() {
        System.out.print("Adios ");
    }
}
