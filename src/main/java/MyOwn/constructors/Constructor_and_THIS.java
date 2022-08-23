package MyOwn.constructors;

import java.util.Scanner;

public class Constructor_and_THIS {
    private String name;
    private int age;
    public Constructor_and_THIS setValues() { // constructor but with NAME, so we will have to add return statement
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter age");
        this.age = sc.nextInt();
        this.name = name;
        return this;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

    public static void main(String[] args) {
        Constructor_and_THIS object = new Constructor_and_THIS();
        object.setValues();
        object.display();
    }
}
