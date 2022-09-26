package myOwn.conceptsOOP.Abstraction.Interface.Shape;

public class ShapeBuilder {
    int length;
    int width;
    int height;
    int eagle;

    public ShapeBuilder length(int length) {
        this.length = length;
        return this;
    }

    public Square build() {
        return new Square(this);
    }

    public ShapeBuilder width(int width) {
        this.width = width;
        return this;
    }

}
