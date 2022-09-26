package myOwn.list.listWithBuilder_;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> gods;
        Character Zeus = new chrBuilder("Zeus", "mage", "Greek").mana(350).skills(4).role("middle lane").build();
        Character Loki = new chrBuilder("Loki", "hunter", "Nordic").inten(300).skills(5).role("jungle").build();

        gods = List.of(Zeus, Loki);

        System.out.println(gods);
    }
}
