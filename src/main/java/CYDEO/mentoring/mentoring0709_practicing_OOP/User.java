package CYDEO.mentoring.mentoring0709_practicing_OOP;

public class User {
    private static final DataBase dataBase = DataBase.getInstance();

    public final String name;
    public final int age;

    private String description;
    private long phoneNumber;
    private String birthDay;

    public String status;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        checkAge(age);
        checkName(name);

        dataBase.names.add(name);
    }


    // static methods
    public static DataBase getDataBase() {
        return dataBase;
    }


    // getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDescription() {
        return description;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public String getBirthDay() {
        return birthDay;
    }


    // setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoneNumber(long phoneNumber) {
        checkPhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }

    // checking methods -- to check if any field is valid or not
    private void checkAge(int age) {
        if (age < 13) {
            throw new RuntimeException("Invalid age");
        }
    }

    private void checkName(String name) {
        if (dataBase.names.contains(name)){
            throw new RuntimeException("This name does already exists");
        }
    }

    private void checkPhoneNumber(long phoneNumber) {
        if (String.valueOf(phoneNumber).length() != 10) {
            throw new RuntimeException("Invalid phone number");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
