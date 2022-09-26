package myOwn.conceptsOOP.Abstraction.Interface.Shape;

public class Square extends ShapeBuilder {
    public final int length;
    public Square (ShapeBuilder builder) {
        this.length = builder.length;
    }
}
