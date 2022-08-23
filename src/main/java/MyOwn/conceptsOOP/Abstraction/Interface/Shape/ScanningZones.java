package MyOwn.concetpsOfOOP.Abstraction.Interface.Shape;

public class ScanningZones {
    public static void main(String[] args) {
        WorkWithShape square = new Square1(14);
        square.scanning(); square.findPerimeter(); square.findArea();
        WorkWithShape rec = new Rectangle.RectangleBuilder("ABC")
                .width(14).length(12).build();
        rec.scanning(); rec.findPerimeter(); rec.findArea();

    }
}



interface WorkWithShape {
    void scanning();
    void findPerimeter();
    void findArea();
}

class Square1 implements WorkWithShape {
    int length;
    public Square1(int length) {
        this.length = length;
    }

    @Override
    public void scanning() {
        System.out.println("----Scanning the square");
    }
    @Override
    public void findPerimeter() {
        int P = length*4;
        System.out.println("P = a*4;\t\tP = " + length + "*4=" + P);
    }
    @Override
    public void findArea() {
        int S = length*length;
        System.out.println("S = a*a;\t\tS = " + length + "*" + length + "=" + S);
    }
}

class Rectangle implements WorkWithShape {
    private final String name;
    private final int length, width;
    public Rectangle (RectangleBuilder builder) {
        this.name = builder.name;
        this.length = builder.length;
        this.width = builder.width;
    }
    static class RectangleBuilder {
        public final String name;
        public RectangleBuilder(String name) {
            this.name = name;
        }
        public int length, width;
        public RectangleBuilder length(int length) {
            this.length = length;
            return this;
        }

        public RectangleBuilder width(int width) {
            this.width = width;
            return this;
        }
        public Rectangle build() {
            return new Rectangle(this);
        }
    }
    @Override
    public String toString() {
        return "length(a) = " + length + "\t\twidth(b) = " + width;
    }
    @Override
    public void scanning() {
        System.out.println("-----scanning the rectangle");
        System.out.println(this);
    }
    @Override
    public void findPerimeter() {
        int P = (length + width)*2;
        System.out.println("P = (a+b)*2;\tP = (" + length + "+" + width + ")*2=" + P);
    }
    @Override
    public void findArea() {
        int S = length*width;
        System.out.println("S = (a*b);\t\tS = " + length + "*" + width + "=" + S);
    }
}
