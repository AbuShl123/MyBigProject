package CYDEO.mentoring.mentoring1408_mathematics.plan;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEquationPlan {
    @Test
    public void test1() {
        assertEquals(5, Equation_plan.solveEquation("15-x=10"));
    }

    @Test
    public void test2() {
        assertEquals(15, Equation_plan.solveEquation("x-5=10"));
    }

    @Test
    public void test3() {
        assertEquals(1, Equation_plan.solveEquation("x+12=13"));
    }

    @Test
    public void test4() {
        assertEquals(6, Equation_plan.solveEquation("x+15=21"));
    }

    @Test
    public void test5() {
        assertEquals(3, Equation_plan.solveEquation("-23+x=-20"));
    }

    @Test
    public void test6() {
        assertEquals(-10, Equation_plan.solveEquation("x+10=0"));
    }

    @Test
    public void test7() {
        assertEquals(-10, Equation_plan.solveEquation("x-12=-22"));
    }

    @Test
    public void test8() {
        assertEquals(-5, Equation_plan.solveEquation("15-x=20"));
    }

    @Test
    public void test9() {
        assertEquals(8, Equation_plan.solveEquation("-12-x=-20"));
    }
}
