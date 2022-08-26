package CYDEO.days.day40_inheritance.shape;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
        area = area();
        perimeter = perimeter();
    }

    @Override
    public double area(){
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
