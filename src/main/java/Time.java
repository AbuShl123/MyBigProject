public class Time {
    private String name = "John";
    private int age = 25;
    private String college = "MIT";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCollege() {
        return college;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Time{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                '}';
    }
}

class User {
    public static void main(String[] args) {
        Time obj = new Time();

        System.out.println(obj.getName());
        obj.setName("Abu");
    }
}

