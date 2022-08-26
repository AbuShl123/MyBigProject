package CYDEO.days.day40_inheritance.shape;

public class Test {
    public static void main(String[] args) {
        Square s = new Square(5);

        System.out.println(s);
        System.out.println(s.perimeter);

        Rectangle r = new Rectangle(10, 6);
        System.out.println(r);
        System.out.println(r.area);

        Circle c = new Circle(4);
        System.out.println(c);
        System.out.println(c.perimeter);
    }
}
