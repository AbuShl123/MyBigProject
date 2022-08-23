package MyOwn.OOPconcepts.Class_And_Object.oneMore;

public class Class2 {
    static int a;
    static int b;
    public static int sum() {
        return a + b;
    }


    int num1, num2;
    public void setValues(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    public int summize() {
        return num1 + num2;
    }

    public static void main(String[] args) {
        a = 12;
        b = 10;
        System.out.println(sum());

        Class2 obj = new Class2();
        obj.setValues(10,100);
        System.out.println(obj.summize());
    }
}
