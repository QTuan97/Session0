package src.MyPoint;

import java.util.Scanner;

public class MyPointTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your next X coordinate");
        double yourX = sc.nextDouble();
        System.out.println("Enter your next Y coordinate");
        double yourY = sc.nextDouble();
        MyPoint currentPoint = new MyPoint();
        MyPoint nextPoint = new MyPoint();
        nextPoint.setXY(yourX,yourY);
        currentPoint.getDistance(nextPoint.getX(),nextPoint.getX());
    }
}
