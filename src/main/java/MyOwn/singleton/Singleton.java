package MyOwn.singleton;

public class Singleton { // in OOP singleton class is a class that can only have one object.

    private static Singleton single_instance = null;

    String s;

    private Singleton() { // since the constructor is private, we cannot create an object of that class in outer world;
        s = "I am the string in the singleton class";
    }

    // Static method
    // to create instance of Singleton class
    public static Singleton getInstance() {
        if (single_instance == null) { // why if??
            single_instance = new Singleton();
        }
        return single_instance;

        /*
        In a singleton class, when we first-time call the getInstance() method, it creates an object of the class with the name single_instance and returns it to the variable. Since single_instance is static, it is changed from null to some object. Next time, if we try to call the getInstance() method since single_instance is not null, it is returned to the variable, instead of instantiating the Singleton class again. This part is done by if condition.
         */
    }

}

class Test {
    public static void main(String[] args) {
        // Singleton obj = new Singleton(); // ERROR
        Singleton object = Singleton.getInstance();
        System.out.println(object.s);

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println("The hash code of x: " + x.hashCode());
        System.out.println("The hash code of y: " + y.hashCode());
        System.out.println("The hash code of z: " + z.hashCode());

        if (x == y && y == z) {
            System.out.println("Three objects point to the same memory location on the heap i.e. to the same object");
        } else {
            System.out.println("Three objects do not point to the same memory location on the heap i.e. the same object");
        }
    }
}