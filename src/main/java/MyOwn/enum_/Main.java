package MyOwn.enum_;

/*
An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
 */

public class Main {
    enum FirstEnum { // we use enum for unchangeable attributes
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        FirstEnum myVar = FirstEnum.MEDIUM;
        System.out.println(myVar);

        System.out.println("\n\n\nswitch method:");
        switch (myVar){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        System.out.println("\n\n\nfor loop:");
        for (FirstEnum var : FirstEnum.values()) {
            System.out.println(var);
        }
    }
}


