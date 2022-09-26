package myOwn.conceptsOOP.Class_And_Object;

public class two {
    int zz;
    public void setPropsTwo(int zz) {
        this.zz = zz;
    }

    public String Compare(int a) {
        return "The " + Math.max(zz, a) + " is biggest";
    }

    public static void main(String[] args) {
        One obj1 = new One();
        obj1.setPropsOne(23,21,45);
        two obj2 = new two();
        obj2.setPropsTwo(56);
        System.out.println(obj2.Compare(obj1.findMax()));
        System.out.println(obj1.summize());
    }
}
