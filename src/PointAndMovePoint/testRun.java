package src.PointAndMovePoint;
public class testRun {
    public static void main(String[] args) {
        Point point1 = new Point(1,3);
        MovablePoint movePoint1 = new MovablePoint(point1.getX(),point1.getY(),2, 4);
        System.out.println(movePoint1.toString());
        System.out.println(movePoint1.move());

    }
}
