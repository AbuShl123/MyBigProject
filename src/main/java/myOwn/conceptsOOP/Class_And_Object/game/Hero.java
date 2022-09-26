package myOwn.conceptsOOP.Class_And_Object.game;

public class Hero {
    String name;
    int health;
    double speed;
    int protective;
    int damage;
    static Hero hero;

    private Hero(String name, int health, double speed, int protective, int damage) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.protective = protective;
    }

    public static Hero Steve() {
        if (hero == null) {
            hero = new Hero("Steve", 120, 3.5, 30, 60);
        }
        return hero;
    }

    public static Hero Alex() {
        if (hero == null) {
            hero = new Hero("Alex", 100, 4.5, 20, 80);
        }
        return hero;
    }

}
