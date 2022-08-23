package MyOwn.concetpsOfOOP.Inheritence;

class Shape {
    private final String name;
    private final int  AmCorners, AmSides;
    private final boolean isAllEq;
    private final boolean isOpEq;

    public Shape(String name, int AmCorners, int AmSides, boolean isAllEq, boolean isOpEq) {
        this.name = name;
        this.AmCorners = AmCorners;
        this.AmSides = AmSides;
        this.isAllEq = isAllEq;
        this.isOpEq = isOpEq;
    }

    @Override
    public String toString() {
        return "This is - " + name + ". It has " + AmSides + " sides, " + AmCorners + " corners." +
                "\n\tare all sides equal -- " + isAllEq + "\n\tare only opposite sides equal -- " + isOpEq;
    }
}

class Square extends Shape {
    public Square (String name, int AmSides, int AmCorners, boolean isAllEq, boolean isOpEq) {
        super(name, AmSides, AmCorners, isAllEq,  isOpEq);
    }
    public static Square build() {
        return new Square("Square", 4,4, true, true);
    }
}

class Rectangle extends Shape{
    public Rectangle (String name, int AmSides, int AmCorners, boolean isAllEq, boolean isOpEq) {
        super(name, AmSides, AmCorners, isAllEq, isOpEq);
    }
    public static Rectangle build() {
        return new Rectangle("Rectangle", 4, 4, false, true);
    }
}

public class gamesWithShapes {
    public static void main(String[] args) {
        Square obj1 = Square.build();
        System.out.println(obj1);
        Shape obj2 = Rectangle.build();
        System.out.println(obj2);


    }
}

