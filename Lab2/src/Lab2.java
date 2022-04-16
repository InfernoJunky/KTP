public class Lab2 {
    public static void main(String[] args) {
        Point3d p1 = new Point3d();
        Point3d p2 = new Point3d(1, -2, 3);
        Point3d p3 = new Point3d(1, -2, -3);
        double s = Point3d.computeArea(p1, p2, p3);
        System.out.println(Double.compare(s, 0d) == 0 ? "Есть одинаковые точки!" : s);
    }
}