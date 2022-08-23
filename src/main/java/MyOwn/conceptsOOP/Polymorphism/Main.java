package MyOwn.concetpsOfOOP.Polymorphism;

// All characters attack with the physical weapon like knight or sword
class Characters {
    void baseAttack() {
        System.out.println("Attack with the weapon");
    }
}

class warrior extends Characters {

}

class killer extends Characters {

}

// But only mages are use magic stick to attack
class mage extends Characters {
    void baseAttack() {
        System.out.println("Attack with the magic stick");
    }
}

public class Main {
    public static void main(String[] args) {
        Characters loki = new killer();
        loki.baseAttack();
        Characters bellona = new warrior();
        bellona.baseAttack();
        Characters hades = new mage();
        hades.baseAttack();
    }
}

// Is that polymorphism?