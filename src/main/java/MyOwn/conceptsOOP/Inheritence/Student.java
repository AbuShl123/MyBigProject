package MyOwn.concetpsOfOOP.Inheritence;

public class Student extends Person { // student is a person but
    public int course; // he studies
    public String direction; // he has a direction
    //public void human(String name)
    void inh(String name, int age) {
        super.age = age;
        super.name = name;
    }
}
