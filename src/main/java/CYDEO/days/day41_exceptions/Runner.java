package CYDEO.days.day41_exceptions;

public class Runner {
    public static void main(String[] args) {
        Person obj = new Person();

        obj.setName("Jame");
        obj.setAge(21);

        System.out.println(obj);

        Person obj2 = new Person();
        obj2.setName("Julie");
        obj2.setAge(-30);
        System.out.println(obj2);
    }
}
