package MyOwn.concetpsOfOOP.Abstraction.AbstractClasses;



//  abstract class
abstract class Animal {
    public abstract void AnimalSound(); //  abstract method - does not have a body
    public void sleep() {  // just a simple method -- has body
        System.out.println("Zzz");
    }


}
// but subclass can
class Pig extends Animal {
    @Override
    public void AnimalSound() {
        System.out.println("The pig says wee wee");
    }
}

class Main { // you cannot create an object of an abstract class
    public static void main(String[] args) {
        Animal a; // this is not an error
        a = new Pig();
        a.sleep();
        //  Animal obj = new Animal(); // but that would be an error
        Pig obj = new Pig();
        obj.AnimalSound();
        obj.sleep();
    }
}