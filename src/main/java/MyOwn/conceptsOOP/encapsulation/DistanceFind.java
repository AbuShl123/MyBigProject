package MyOwn.conceptsOOP.encapsulation;

public class DistanceFind {
    double x;
    double y;

    public DistanceFind(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(DistanceFind other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        DistanceFind point1 = new DistanceFind(12, 3);
        DistanceFind point2 = new DistanceFind(5, 4);
        double distance1 = point1.getDistance(point2);
        System.out.println(distance1);
        double distance2 = point2.getDistance(point1);
        System.out.println(distance2);
        // one guy on youtube wrote this code
        // this is the example of another definition of encapsulation
    }


}
