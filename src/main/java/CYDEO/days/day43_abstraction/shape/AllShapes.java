package CYDEO.days.day43_abstraction.shape;

public class AllShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);

        System.out.println((int) circle.area());
        System.out.println((int) circle.perimeter());

        System.out.println(circle.name);
        System.out.println(circle.r);

    }
}
