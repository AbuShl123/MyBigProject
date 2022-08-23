package MyOwn.static_;

public class Child extends Parent {
    @Override
    public void run() { // only method run() can be overridden because method go() is static.
        go();
        System.out.println("running with effects");
    }

    public static void checkGo() {
        System.out.println("Checking go!");
        go();
    }

    public static void main(String[] args) {
        go(); // but go() is inherited
    }
}
