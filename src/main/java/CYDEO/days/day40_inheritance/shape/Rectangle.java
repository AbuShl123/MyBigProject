package CYDEO.days.day40_inheritance.shape;

public class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
        area = area();
        perimeter = perimeter();
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", length=" + length + ", width=" + width;
    }
}
