package myOwn.builderPattern;

public final class User {
    //all final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    //All getter, and NO setter to provide immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }

    public String toString() {
        return "User: " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + ", " + this.address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        //Return the finally constructed User object
        public User build() {
            return new User(this);
        }
    }
    public static void main(String[] args) {
        User user1 = new UserBuilder("Lokesh", "Gupta").age(30).phone("+7-771-989-2464").address("Fake address 1234").build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Jack", "Reacher").age(40).phone("+7-775-850-8060").age(2).build(); //no address
        System.out.println(user2);

        User user3 = new User.UserBuilder("Super", "Man").build(); //No age//No phone//no address
        System.out.println(user3);

        System.out.println(user1.getAddress());
        System.out.println(user2.getAge());
        System.out.println(user3.getFirstName());
        System.out.println(user3.getLastName());
        System.out.println(user1.getPhone());
    }
}
