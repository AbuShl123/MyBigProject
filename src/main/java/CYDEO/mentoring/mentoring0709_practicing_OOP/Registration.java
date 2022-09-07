package CYDEO.mentoring.mentoring0709_practicing_OOP;

public class Registration {
    public static void main(String[] args) {
        User user = new User("Paul", 15);

        System.out.println("Your name is : " + user.getName());
        System.out.println("And you are " + user.getAge() +
                " years old.");

        User user1 = new User("Lois", 34);

        System.out.println(User.getDataBase());

        User user2 = new User("Abu", 29);
        System.out.println(user2.getDescription());

        user2.setDescription("I am just a big fun of java");
        System.out.println(user2.getDescription());

        user2.setPhoneNumber(2342422888L);
        System.out.println(user2.getPhoneNumber());

        user2.setBirthDay("March 6");
        System.out.println(user2.getBirthDay());

        DataBase dataBase = DataBase.getInstance();
        System.out.println(dataBase);

        System.out.println(user2);
        System.out.println(user1);

        user2.status = "At lesson";

        System.out.println(user2.status);
    }
}
