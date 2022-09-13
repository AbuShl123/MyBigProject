package CYDEO.days.day43_abstraction.shape;

public class Circle extends Shape{
    public final double r;
    public Circle(double radius) {
        super("Circle");
        this.r = radius;
    }

    @Override
    public double area() {
        return Math.PI + Math.pow(r, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI + r;
    }

    public String toString() {
        String org = super.toString();
        return org.substring(0, org.indexOf("|")) + "| radius=" + r + " " + org.substring(org.indexOf("|"));
    }
}
