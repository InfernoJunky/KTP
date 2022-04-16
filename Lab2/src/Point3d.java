import java.util.Objects;

public class Point3d extends Point2d{
    private double zCoord;

    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    public Point3d () {
        this(0d, 0d, 0d);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double z) {
        zCoord = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3d point3d = (Point3d) o;
        return Double.compare(point3d.getX(), getX()) == 0 &&
                Double.compare(point3d.getY(), getX()) == 0 &&
                Double.compare(point3d.getZ(), getZ()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }

    public double distanceTo(Point3d p) {
        return Math.sqrt(Math.pow(p.getX() - getX(), 2) + Math.pow(p.getY() - getY(), 2) + Math.pow(p.getZ() - getZ(), 2));
    }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        if (p1.equals(p2) || p2.equals(p3) || p1.equals(p3))
            return 0d;
        double a = p1.distanceTo(p2);
        double b = p1.distanceTo(p3);
        double c = p2.distanceTo(p3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}