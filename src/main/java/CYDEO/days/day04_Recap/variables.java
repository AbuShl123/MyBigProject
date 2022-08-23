package CYDEO.days.day04_Recap;

public class variables {
    public static void main(String[] args) {
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkillDays;

        temperature = 74.2;
        numberOfJavaDays = 4;
        numberOfSoftSkillDays = 2;

        System.out.println("temperature " + temperature + "C");
        System.out.println("numberOfJavaDays: " + numberOfJavaDays);
        System.out.println("numberOfSoftSkillDays: " + numberOfSoftSkillDays);

        char upper = 'E';
        char lower = 'e';
        char spacr = ' ';
        char special = '#';
        System.out.println("special " + special);
        char number = 65_333;
        System.out.println(number);

        char l1 = 'A',
                l2 = 'b',
                l3 = 'u',
                l4 = 'b',
                l5 = 'a',
                l6 = 'k',
                l7 = 'r';
        System.out.print("" + l1 + l2 + l3 + l4 + l5 + l6 + l7);
    }
}
