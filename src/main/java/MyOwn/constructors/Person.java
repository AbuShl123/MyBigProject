package MyOwn.constructors;

public class Person {
    // by default constructors are empty, and you can't see them, but they are here;
    public int age = 17; //public int means that we can reference to it in other classes. By default, it = 17
    public String name = ""; //the same thing, but it's String and has an empty value by default

    //creating a new constructor:
    public Person( String name, int age) { //by default there is no anything inside of brackets of constructor and the body is empty too
        this.age = age;
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public  Person() {}  // Although after establishing new constructor the invisible one disappears, and we need recreate it



}
