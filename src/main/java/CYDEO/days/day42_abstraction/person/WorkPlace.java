package CYDEO.days.day42_abstraction.person;

import CYDEO.days.day42_abstraction.exercize.Lifting;

import java.util.ArrayList;
import java.util.List;

public class WorkPlace {
    public static void main(String[] args) {

        Tester abu = new Tester("Abu", 17, "SDET", 1_000_000_000);

        System.out.println(abu);
        abu.sleep(12);
        abu.work();


        ArrayList<Tester> testers = new ArrayList<>();
        testers.add(abu);

        testers.addAll(List.of(
                new Tester("Umid", 17, "SDET", 10_000),
                new Tester("Bekhruz", 20, "SDET", 10_000)
        ));

        System.out.println(testers);
    }
}
