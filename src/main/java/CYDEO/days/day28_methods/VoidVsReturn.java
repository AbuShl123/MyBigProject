package CYDEO.days.day28_methods;

public class VoidVsReturn {
    public static void sayHello() {
        System.out.println("Hello");
    }

    public static String sayBye() {
        return "Bye";
    }

    public static void main(String[] args) {
        sayHello();

        String str = sayBye();
        System.out.println(str);
    }
}