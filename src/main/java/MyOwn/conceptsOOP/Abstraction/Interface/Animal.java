package MyOwn.concetpsOfOOP.Abstraction.Interface;

public interface Animal { // An interface is a completely "abstract class" that is used to group related methods with empty bodies:
    void animalSound();
    void sleep();
}

class Pig implements Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says wee wee");
    }
    @Override
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}