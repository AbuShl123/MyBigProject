package myOwn.builderPattern;

public class Test {
    public static void main(String[] args) {
        User obj = new User.UserBuilder("Abubakr", "Shoaliev").age(17).build();
    }
}
