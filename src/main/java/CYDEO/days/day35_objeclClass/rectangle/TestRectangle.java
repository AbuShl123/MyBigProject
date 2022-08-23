package CYDEO.days.day35_objeclClass.rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.height = 8.6;
        rc.base = 4.2;
        rc.findPerimeter();
        rc.calculateArea();
        System.out.println(rc);
    }
}
