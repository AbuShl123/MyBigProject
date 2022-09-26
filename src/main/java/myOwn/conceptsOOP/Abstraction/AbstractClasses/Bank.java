package myOwn.conceptsOOP.Abstraction.AbstractClasses;

abstract class Bank{
    abstract int AmountOfMoney(); // abstract method
}
class user1 extends Bank{
    int AmountOfMoney(){return 10_000;}
}
class user2 extends Bank{
    int AmountOfMoney(){return 8_000;}
}


class TestingBank {
    public static void main(String[] args) {
        Bank b;
        b = new user1();
        System.out.println("The user 1 has $" + b.AmountOfMoney() + " in his account");
        b = new user2();
        System.out.println("The user 2 has $" + b.AmountOfMoney() + " in his account");
    }
}

