package CYDEO.days.day33_arrayList;

public class UsingAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.species = "Lions";
        animal1.numOfLegs = 4;
        animal1.age = 15;
        animal1.canFly = false;
        animal1.weight = 200;

        System.out.println(animal1.species);
        System.out.println(animal1.numOfLegs);
        System.out.println(animal1.age);
        System.out.println(animal1.canFly);
        System.out.println(animal1.weight);


    }
}
