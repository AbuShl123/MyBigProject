package MyOwn.list.ListWithBuilder_;

public class Character {
    private final String name;
    private final String type;
    private final String mythology;
    private final int mana;
    private final int inten;
    private final int skills;
    private final String role;

    public Character(chrBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.mythology = builder.mythology;
        this.mana = builder.mana;
        this.inten = builder.inten;
        this.skills = builder.skills;
        this.role = builder.role;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getMythology() {
        return mythology;
    }
    public int getMana() {
        return mana;
    }
    public int getInten() {
        return inten;
    }
    public int getSkills() {
        return skills;
    }
    public String getRole() {
        return role;
    }
    @Override
    public String toString() {
        return "\ncharacter name: " + name + "\n\ttype: " + type + "\n\tmythology: " + mythology+ "\n";
    }
}

class chrBuilder {
    final String name;
    final String type;
    final String mythology;
    int mana;
    int inten;
    int skills;
    String role;

    public chrBuilder (String name, String type, String mythology) {
        this.name = name;
        this.type = type;
        this.mythology = mythology;
    }

    public chrBuilder mana(int mana) {
        this.mana = mana;
        return this;
    }
    public chrBuilder inten(int inten) {
        this.inten = inten;
        return this;
    }
    public chrBuilder skills(int skills) {
        this.skills = skills;
        return this;
    }
    public chrBuilder role(String role) {
        this.role = role;
        return this;
    }
    public Character build() {
        return new Character(this);
    }
}