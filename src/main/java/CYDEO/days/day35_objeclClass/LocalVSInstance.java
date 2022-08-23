package CYDEO.days.day35_objeclClass;

public class LocalVSInstance {
    int a = 5;
    int b = 10;

    public LocalVSInstance(int a, int z) {
        this.a = a;
        b = z;
    }

    public void print(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVSInstance obj = new LocalVSInstance(12, 5);
        System.out.println(obj.a);
    }
}
