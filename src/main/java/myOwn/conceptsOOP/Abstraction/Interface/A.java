package myOwn.conceptsOOP.Abstraction.Interface;

import java.util.Vector;

public interface A {
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A {
    @Override
    public void b() {
        System.out.println("I am b");
    }
}

class both extends B {
    @Override
    public void a() {
        System.out.println("I am a");
    }
    @Override
    public void c() {
        System.out.println("I am c");
    }
    @Override
    public void d() {
        System.out.println("I am d");
    }

    int age;
    public both (int age) {
        this.age = age;
    }


    public both() {}


    void run() {
        System.out.println("running");
    }
}

class TestingAll {
    public static void main(String[] args) {
        A obj = new both();
        Vector<Integer> vector = new Vector<>();

    }
}

