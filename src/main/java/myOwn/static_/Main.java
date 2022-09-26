package myOwn.static_;

public class Main {

    int a; // non-static fields can be used only in non-static methods

    static int b = 0; // static fields can be used in any type of methods

    public void non_static() {
        a = 12;
        b = 3;
    }

    public static void _static() {
        // static method cannot call a non-static field
        b = 10;
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.run();
        // but we cannot call obj.go()
        Parent.go();
        Child.go(); // but we can also do like that

//      Parent.run();     // will cause an error

        Parent parent = new Parent();
        parent.run(); // so we should do like that

    }
}
