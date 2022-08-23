package MyOwn.OOPconcepts.Class_And_Object.BigExample;

public class Point {
    public int x = 0;
    public int y = 0;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void sum() {
        int a = x + y;
        System.out.println(a);
    }
}
