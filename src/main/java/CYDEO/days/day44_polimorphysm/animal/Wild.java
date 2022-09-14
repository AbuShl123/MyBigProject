package CYDEO.days.day44_polimorphysm.animal;

public class Wild {
    public static void main(String[] args) {

        Animal animal = new Lizard();

        Reptile reptile = new Lizard();

        Lizard lizard = new Lizard();

        animal.eat();
        reptile.eat();
        lizard.eat();
    }
}
