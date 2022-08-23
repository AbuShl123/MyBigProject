package MyOwn.conceptsOOP.Inheritence.inheritance_fields;

public class Child2 extends SuperAbstract{
    private final String name = "PUpu";
    public Child2() {
        int power = 100;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void abilityOne() {
        System.out.println("PUpu blowing!");
    }

    @Override
    public void abilityTwo() {
        System.out.println("Big JUMP!");
    }

    @Override
    public void abilityThree() {
        System.out.println("Say bye! -- explosion!");
    }
}
