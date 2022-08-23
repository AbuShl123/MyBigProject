package MyOwn.concetpsOfOOP.Class_And_Object;

public class One {
    int a;
    int b;
    int c;
    public void setPropsOne(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int summize() {
        return a+b+c;
    }
    public int findMax() {
        int d = Math.max(a,b);
        return Math.max(d, c);
    }
}
