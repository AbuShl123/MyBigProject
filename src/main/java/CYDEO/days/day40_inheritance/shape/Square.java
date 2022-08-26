package CYDEO.days.day40_inheritance.shape;

public class Square extends Shape{
    double length;
    public Square(double length) {
        super("Square");
        this.length = length;
        area = area();
        perimeter = perimeter();
    }

    @Override
    public double area() {
        return Math.pow(length,2);
    }

    @Override
    public double perimeter() {
        return length * 4;
    }

}
