package MyOwn.singleton;

public class LazyCreation {
    private static LazyCreation single_instance = null;
    private static int a;

    String power;

    private LazyCreation() {
    }

    public static LazyCreation getInstance() {
        if (single_instance == null) {
            single_instance = new LazyCreation();
        }

        return single_instance;
    }

    public void setPower(int a) {
        if (a > 100) power = "High power, i am excited!";
        else if (a >= 50) power = "Average power, i am normal";
        else power = "Slow power, i am lazy";
    }

    public static int getValue() {
        if (a == 0) {
            a = 12;
        }
        return a;
    }

    public static void printA() {
        System.out.println("the value of a: " + a);
    }
}

class Test2 {
    public static void main(String[] args) {
        LazyCreation obj1 = LazyCreation.getInstance();
        LazyCreation obj2 = LazyCreation.getInstance();

        LazyCreation.printA();
        int c = LazyCreation.getValue();
        LazyCreation.printA();
        System.out.println("Our c = " + c);

        System.out.println(obj1.power);
        obj1.setPower(67);
        System.out.println(obj1.power);
        System.out.println(obj2.power); // both objects will give the same result
        obj1.setPower(123);
        System.out.println("Changing power\n" + obj1.power);
    }
}
