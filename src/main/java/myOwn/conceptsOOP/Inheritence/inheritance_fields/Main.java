package myOwn.conceptsOOP.Inheritence.inheritance_fields;

public class Main {
    public static void main(String[] args) {
        Super obj1 = new Child1();
        System.out.println(obj1.getName() + "'s abilities: ");
        obj1.abilityOne();
        obj1.abilityTwo();
        obj1.abilityThree();

        System.out.println("---------------------");

        Super obj2 = new Child2();
        System.out.println(obj2.getName() + "'s abilities: ");
        obj2.abilityOne();
        obj2.abilityTwo();
        obj2.abilityThree();
        System.out.println(obj1.getName());
    }
}
