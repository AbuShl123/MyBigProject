package myOwn.conceptsOOP.encapsulation;

public class EncapsulationExample {
    private int age;
    private String name;
    public void properties(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String Read() {
        return name + " is reading";
    }
    public String Play() {
        return name + " is playing";
    }
    public String WhatAge() {
        return name + " is " + age + " years old";
    }
    public static void main(String[] args) {
        EncapsulationExample Abu = new EncapsulationExample();
        Abu.properties(17,"Abu");
        System.out.println(Abu.Play());
        System.out.println(Abu.Read());
        System.out.println(Abu.WhatAge());
    }
}
