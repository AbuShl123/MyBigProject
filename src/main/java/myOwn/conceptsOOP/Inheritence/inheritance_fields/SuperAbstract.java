package myOwn.conceptsOOP.Inheritence.inheritance_fields;

public abstract class SuperAbstract implements Super{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void baseAttack() {
        System.out.println("Throwing small electronic balls");
    }
}
