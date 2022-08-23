package MyOwn.conceptsOOP.encapsulation;

public class DistanceFind {
    double x;
    double y;

    public static DistanceFind makePoint(double x, double y) {
        DistanceFind point = new DistanceFind();
        point.x = x;
        point.y = y;

        return point;
    }

    public double getDistance(DistanceFind other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        DistanceFind point1 = makePoint(12, 3);
        DistanceFind point2 = makePoint(5, 4);
        double distance1 = point1.getDistance(point2);
        System.out.println(distance1);
        double distance2 = point2.getDistance(point1);
        System.out.println(distance2);
    }
}
