package myOwn.builderPattern.SMITE;

public class Characters {
    private final String name;
    private final String type;
    private final String mythology;
    int power;

    Characters (String name, String type, String mythology, int power) {
        this.name = name;
        this.type = type;
        this.mythology = mythology;
        this.power = power;
    }

}

class Mage extends Characters{
    int mana;
    public Mage (String name, String type, String mythology, int power, int mana) {
        super(name, type, mythology, power);
        this.mana = mana;
    }
}

class Hunter extends Characters {
    int dexterity;
    Hunter(String name, String type, String mythology, int power, int dexterity) {
        super(name, type, mythology, power);
        this.dexterity = dexterity;
    }
}

class Main {
    public static void main(String[] args) {
        Characters Zeus = new Mage("Zeus", "mage", "Greek", 120, 300);
        Characters Neith =  new Hunter("Neith", "hunter", "Egypt", 140, 200);


    }
}


