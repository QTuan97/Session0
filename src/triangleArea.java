package src;
import java.util.Scanner;
public class triangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of frist side ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the length of second side ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the length of third side ");
        double side3 = sc.nextDouble();
        isValid(side1,side2,side3);
        if(isValid(side1,side2,side3)) {
            System.out.print("The area of the triangle is " + area(side1, side2, side3));
        }
    }
    public static boolean isValid(double side1, double side2, double side3){
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        }else
            return false;
    }
    public static double area ( double side1, double side2, double side3){
            double s = (side1 + side2 + side3) / 2;
            double result = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            return result;
    }
}
