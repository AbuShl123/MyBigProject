package MyOwn.OOPconcepts.Class_And_Object.BigExample;

import java.util.List;

public class Rectangle {
    public int width = 0;
    public  int height = 0;
    public Point origin;

    public Rectangle() {
        origin = new Point(0,0);
    }

    public Rectangle(Point p) {
        origin = p;
    }

    public Rectangle(Point p, int w, int h) { // <-- here
        origin = p;
        width = w;
        height = h;
    }

    public Rectangle (int w, int h) {
        this(new Point(0,0), w, h);
//          (Point p, int w, int h)
    } // this constructor refers to the constructor above

    //A method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }


    //A method for computing the area of the rectangle
    public int area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "h = " + height + "\t\t\tw = " + width + "\norigin.x = " + origin.x + "\torigin.y = " + origin.y;
    }

    public static void main(String[] args) {
        Point originOne = new Point(23, 94);


        Rectangle obj1 = new Rectangle();
        System.out.println("obj1: \n" + obj1);
        System.out.println("-------------------------------");
        Rectangle obj2 = new Rectangle(new Point(12,4));
        System.out.println("obj2: \n" + obj2);
        System.out.println("-------------------------------");
        Rectangle obj3 = new Rectangle(originOne, 23, 94);
        System.out.println("obj3: \n" + obj3);
        System.out.println("-------------------------------");
        Rectangle obj4 = new Rectangle(12, 6);
        System.out.println("obj4: \n" + obj4);

        List<Rectangle> shapes = List.of(obj1, obj2, obj3, obj4);
        System.out.println("Areas:");
        for (int i = 1; i < 5; i++) {
            System.out.println("obj" + i + ":" + "\tarea = " + shapes.get(i-1).area());
        }
        System.out.println("-------------------------------");
        obj2.move(15, 9);
        System.out.println("obj2: \n" + obj2);
        System.out.println(obj2.area());
    }
}
