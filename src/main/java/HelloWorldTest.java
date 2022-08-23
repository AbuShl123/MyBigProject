
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class HelloWorldTest {

    @Test
    public void test1() {
        assertEquals(5, HelloWorld.solveEquation("15-x=10"));
    }

    @Test
    public void test2() {
        assertEquals(15, HelloWorld.solveEquation("x-5=10"));
    }

    @Test
    public void test3() {
        assertEquals(1, HelloWorld.solveEquation("x+12=13"));
    }

    @Test
    public void test4() {
        assertEquals(6, HelloWorld.solveEquation("x+15=21"));
    }

    @Test
    public void test5() {
        assertEquals(3, HelloWorld.solveEquation("-23+x=-20"));
    }

    @Test
    public void test6() {
        assertEquals(-10, HelloWorld.solveEquation("x+10=0"));
    }

    @Test
    public void test7() {
        assertEquals(-10, HelloWorld.solveEquation("x-12=-22"));
    }

    @Test
    public void test8() {
        assertEquals(-5, HelloWorld.solveEquation("15-x=20"));
    }

    @Test
    public void test9() {
        assertEquals(8, HelloWorld.solveEquation("-12-x=-20"));
    }

    @Test
    public void test10() {
        assertEquals(12, HelloWorld.solveExample("10+2"));
    }

    @Test
    public void test11() {
        assertEquals(-8, HelloWorld.solveExample("-10+2"));
    }

    @Test
    public void test12() {
        assertEquals(50, HelloWorld.solveExample("56+4-10"));
    }

    @Test
    public void test13() {
        assertEquals(0, HelloWorld.solveExample("-10+5+3+2"));
    }

    @Test
    public void test14() {
        assertEquals(-10, HelloWorld.solveExample("-12+0-3+5"));
    }

    @Test
    public void test15() {
        assertEquals(-100, HelloWorld.solveExample("99+1-100+13-3-110"));
    }

    @Test
    public void test16() {
        assertEquals(14, HelloWorld.solveExample("12+12+12-10-4-8"));
    }

    @Test
    public void test17() {
        assertEquals(10, HelloWorld.solveExample("10-0"));
    }

    @Test
    public void test18() {
        assertEquals(-10, HelloWorld.solveExample("-100+10+87+3-10"));
    }

    @Test
    public void test19() {
        assertEquals(-265, HelloWorld.solveExample("-12-12-45-79-34-8-56-1-2-7-9"));
    }

    @Test
    public void test20() {
        assertEquals(0, HelloWorld.solveExample("12+12+24+5+1+78-132"));
    }
}
