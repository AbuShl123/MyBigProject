package CYDEO.days.day40_inheritance;

public class UsingFinal extends Test{
    public static void main(String[] args) {
        FinalExamples obj1 = new FinalExamples(20);
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        System.out.println(FinalExamples.PLANET);

        System.out.println(FinalExamples.TEST_1);
    }

}

class Test {
    public final void HelloWorld() {
        System.out.println("Hello World");
    }

    public final void HelloWorld(int a) {
        System.out.println("Hello World: " + a);
    }
}
