package CYDEO.days.day41_exceptions.hiding;

public class First {

    public static void staticMethod() {
        System.out.println("This is the static method from the First class");
    }

    public void instanceMethodA() {
        staticMethod();
    }

}
