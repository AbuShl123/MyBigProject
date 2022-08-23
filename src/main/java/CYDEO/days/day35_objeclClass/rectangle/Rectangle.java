package CYDEO.days.day35_objeclClass.rectangle;

public class Rectangle {
    double base;
    double height;
    double perimeter;
    double area;

    public void findPerimeter() {
        perimeter = (base + height)*2;
    }

    public void calculateArea() {
        area = height * base;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
