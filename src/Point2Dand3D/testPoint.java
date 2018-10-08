package src.Point2Dand3D;

public class testPoint {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(1,3);
        Point3D point2 = new Point3D(point1.x,point1.y,2);
        System.out.println(point1.toString());
        System.out.println(point2.toString());
    }
}
