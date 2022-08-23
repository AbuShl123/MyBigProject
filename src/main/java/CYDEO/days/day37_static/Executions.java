package CYDEO.days.day37_static;

public class Executions {
    public static void main(String[] args) {
        System.out.println(1);
        Executions obj = new Executions();
    }

    public Executions() {
        System.out.println(2);
    }

    static {
        System.out.println(3);
    }


}
