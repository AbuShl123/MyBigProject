package myOwn.conceptsOOP.Inheritence.inheritance_fields;

public class Child1 extends SuperAbstract{
    private final String name = "Lully";

    public Child1() {
        int mana = 120;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void abilityOne() {
        System.out.println("Big boom!");
    }

    @Override
    public void abilityTwo() {
        System.out.println("Flying!");
    }

    @Override
    public void abilityThree() {
        System.out.println("Area attacking!");
    }
}
