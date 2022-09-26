package myOwn.conceptsOOP.Polymorphism.morePolymorphism;

public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Abu", "Pr. Ryskulova", 105, 1_000_000.5);
        Employee e = new Salary("Ali", "Pr. Ryskulova", 56, 1_100_000.2);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();

        System.out.println(s.getAddress());
    }
}
