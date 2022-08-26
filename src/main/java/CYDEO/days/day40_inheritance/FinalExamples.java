package CYDEO.days.day40_inheritance;

public final class FinalExamples {
    public final int a = 10;
    public final int b;

    public static final String PLANET = "earth";

    public static final String TEST_1 = "test1_us.google.com";

    public FinalExamples(int num) {
        b = num; // when the object is created, the given argument will be the value of b, then it cannot be changed
    }
}
