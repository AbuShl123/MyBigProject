package myOwn.conceptsOOP.Inheritence;

public class SuperClass {
    public void run() {
        System.out.println("running");
    }
    public void jump() {
        System.out.println("jumping");
    }
    public void swim() {
        System.out.println("swimming");
    }
    public final int playTime = 60;
}

class ChildClass extends SuperClass {
    public void myOwnWish() {
        System.out.println("playing football");
    }
    int myOwnTime = playTime + 30;
}

class TestClass {
    public static void main(String[] args) {
        SuperClass entityOfSuper = new SuperClass();
        System.out.println("object of super class can do: ");
        entityOfSuper.jump();
        entityOfSuper.run();
        entityOfSuper.swim();

        System.out.println("-----------------------");
        System.out.println("object of child class has its own specific method: ");
        ChildClass entityOfChild = new ChildClass();
        entityOfChild.jump(); entityOfChild.run(); entityOfChild.swim(); // these methods were written only 1 time, but can be reused by kids of SuperClass.
        entityOfChild.myOwnWish(); // this method doesn't exist in SuperClass.

        System.out.println("\nobject of super class even if it's equals to new ChildClass() can only do:");
        SuperClass obj = new ChildClass();
        obj.swim(); obj.run(); obj.jump(); // obj has no myOwnWish() although obj = new childOf();

        System.out.println("\nbut there is no ChildClass obj = new SuperClass(); object\n\n");
        /*
        ChildClass obj2 = new SuperClass(); // this cannot be feasible because class ChildOf is a child of MethodsInherit and MethodsInherit is parent of this class.
        */

        int timeOfParent = entityOfSuper.playTime;
        System.out.println(timeOfParent + "min - time that has parent to spend for child");


        int timeOfChild = entityOfChild.playTime; // child has inherited this variable from parent
        int timeOfChild2 = entityOfChild.myOwnTime;  // this variable exists only in child class and parent has no access to it
        System.out.println(timeOfChild + "min - child will play with parent");

        System.out.println(timeOfChild2 + "min - child will play totally");
        System.out.println(timeOfChild2 - timeOfChild + "min - child will play without parent");
    }
}
