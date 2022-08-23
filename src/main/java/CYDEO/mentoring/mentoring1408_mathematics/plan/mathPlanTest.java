package CYDEO.mentoring.mentoring1408_mathematics.plan;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class mathPlanTest {
    @Test
    public void test10() {
        assertEquals(12, Math_plan.solve("10+2"));
    }

    @Test
    public void test11() {
        assertEquals(-8, Math_plan.solve("-10+2"));
    }

    @Test
    public void test12() {
        assertEquals(50, Math_plan.solve("56+4-10"));
    }

    @Test
    public void test13() {
        assertEquals(0, Math_plan.solve("-10+5+3+2"));
    }

    @Test
    public void test14() {
        assertEquals(-10, Math_plan.solve("-12+0-3+5"));
    }

    @Test
    public void test15() {
        assertEquals(-100, Math_plan.solve("99+1-100+13-3-110"));
    }

    @Test
    public void test16() {
        assertEquals(14, Math_plan.solve("12+12+12-10-4-8"));
    }

    @Test
    public void test17() {
        assertEquals(10, Math_plan.solve("10-0"));
    }

    @Test
    public void test18() {
        assertEquals(-10, Math_plan.solve("-100+10+87+3-10"));
    }

    @Test
    public void test19() {
        assertEquals(-265,Math_plan.solve("-12-12-45-79-34-8-56-1-2-7-9"));
    }

    @Test
    public void test20() {
        assertEquals(0, Math_plan.solve("12+12+24+5+1+78-132"));
    }
}
