package CYDEO.days.day28_methods;

public class CharMethods {
    public static void getUpperAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void getLowerAtoZ() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void getUpperZtoA() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void getLowerZtoA() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void count0to9() {
        for (char i = '0'; i <= '9'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }




    public static void main(String[] args) {
        getLowerAtoZ();
        getLowerZtoA();
        getUpperAtoZ();
        getUpperZtoA();
        count0to9();
    }
}
