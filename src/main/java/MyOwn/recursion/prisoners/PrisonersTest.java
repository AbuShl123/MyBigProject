package MyOwn.recursion.prisoners;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrisonersTest {
    @Test
    public void test1() {
        assertEquals(2, Prisoners.whoIsLucky(2, 9));
    }

    @Test
    public void test2() {
        assertEquals(0, Prisoners.whoIsLucky(9, 3));
    }

    @Test
    public void test4() {
        assertEquals(6, Prisoners.whoIsLucky(7, 2));
    }

    @Test
    public void test5() {
        assertEquals(12, Prisoners.whoIsLucky(15, 4));
    }

    @Test
    public void test6() {
        assertEquals(1, Prisoners.whoIsLucky(14, 3));
    }

    @Test
    public void test7() {
        assertEquals(21, Prisoners.whoIsLucky(53, 7));
    }

    @Test
    public void test8() {
        assertEquals(455, Prisoners.whoIsLucky(543, 21));
    }

    @Test
    public void test9() {
        assertEquals(303, Prisoners.whoIsLucky(673, 13));
    }
}
