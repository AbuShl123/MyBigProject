package myOwn.tasks.AscendingConsecutive;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestClass {
    @Test
    public void Test1() {
        assertTrue(AscendingConsecutiveNumbers.ascending("232425"));
    }

    @Test
    public void Test2() {
        assertTrue(AscendingConsecutiveNumbers.ascending("444445"));
    }

    @Test
    public void Test3() {
        assertTrue(AscendingConsecutiveNumbers.ascending("1234567"));
    }

    @Test
    public void Test4() {
        assertTrue(AscendingConsecutiveNumbers.ascending("123412351236"));
    }

    @Test
    public void Test5() {
        assertTrue(AscendingConsecutiveNumbers.ascending("57585960616263"));
    }

    @Test
    public void Test6() {
        assertTrue(AscendingConsecutiveNumbers.ascending("500001500002500003"));
    }

    @Test
    public void Test7() {
        assertTrue(AscendingConsecutiveNumbers.ascending("919920921"));
    }

    @Test
    public void Test8() {
        assertFalse(AscendingConsecutiveNumbers.ascending("2324256"));
    }

    @Test
    public void Test9() {
        assertFalse(AscendingConsecutiveNumbers.ascending("1235"));
    }

    @Test
    public void Test10() {
        assertFalse(AscendingConsecutiveNumbers.ascending("121316"));
    }

    @Test
    public void Test11() {
        assertFalse(AscendingConsecutiveNumbers.ascending("12131213"));
    }

    @Test
    public void Test12() {
        assertFalse(AscendingConsecutiveNumbers.ascending("54321"));
    }

    @Test
    public void Test13() {
        assertFalse(AscendingConsecutiveNumbers.ascending("56555453"));
    }

    @Test
    public void Test14() {
        assertFalse(AscendingConsecutiveNumbers.ascending("90090190290"));
    }

    @Test
    public void Test15() {
        assertFalse(AscendingConsecutiveNumbers.ascending("35236237238"));
    }
}

