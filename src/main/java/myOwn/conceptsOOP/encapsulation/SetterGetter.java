package myOwn.conceptsOOP.encapsulation;

public class SetterGetter {
    private String name, birthplace;
    private int age;
    private char sex;
    private long iin;

    // getters:
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getSex() {
        return sex;
    }
    public long getIin() {
        return iin;
    }
    public String getBirthplace() {
        return birthplace;
    }

    // setters:
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public void setIin(long iin) {
        this.iin = iin;
    }
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    // toString:
    @Override
    public String toString() {
        return "\tname: " + name
                + "\n\tage: " + age
                + "\n\tsex: " + sex
                + "\n\tiin: " + iin
                + "\n\tbirthplace: " + birthplace;
    }
}

class Test {
    public static void main(String[] args) {
        SetterGetter obj = new SetterGetter();
        obj.setName("Abu");
        obj.setAge(17);
        obj.setSex('M');
        obj.setIin(506030089);
        obj.setBirthplace("Tashkent");

        System.out.println(obj.getName() + " " + obj.getAge() + " " + obj.getSex() + " " + obj.getIin() + " " + obj.getBirthplace());

        System.out.println("===================\nNow, using toString: ");
        System.out.println(obj);
    }
}
