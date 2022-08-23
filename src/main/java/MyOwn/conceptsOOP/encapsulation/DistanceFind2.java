package MyOwn.conceptsOOP.encapsulation;

public class DistanceFind2 {
    double x;
    double y;

    public DistanceFind2 (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(DistanceFind2 other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        DistanceFind2 point1 = new DistanceFind2(12, 3);

        DistanceFind2 point2 = new DistanceFind2(10, 5);

        System.out.println(point1.getDistance(point2));

        // Polymorphism is when the objects from the same class can interact with each other
    }
}
