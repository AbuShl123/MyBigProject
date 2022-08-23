package MyOwn.static_;

public class Parent {
    public static void go() { // method go() can't be inherited by childs of this class because it's static.
        System.out.println("Going");
    }

    public void run() {
        System.out.println("running");
    }
}
