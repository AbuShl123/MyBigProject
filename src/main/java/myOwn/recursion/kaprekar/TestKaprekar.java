package myOwn.recursion.kaprekar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestKaprekar {
    @Test
    public void test1() {
        assertEquals(5, Kaprekar.kaprekar(1112));
    }

    @Test
    public void test2() {
        assertEquals(7, Kaprekar.kaprekar(456));
    }

    @Test
    public void test3() {
        assertEquals(3, Kaprekar.kaprekar(76));
    }

    @Test
    public void test4() {
        assertEquals(5, Kaprekar.kaprekar(100));
    }

    @Test
    public void test5() {
        assertEquals(4, Kaprekar.kaprekar(101));
    }
}
