package MyOwn.concetpsOfOOP.Encapsulation;

public class Student {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Abu");
        System.out.println(s.getName());

    }
}