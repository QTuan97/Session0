package src.TriangleClass;

import java.util.Scanner;

public class testRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first side");
        double side1 = sc.nextDouble();
        System.out.println("Enter the length of second side");
        double side2 = sc.nextDouble();
        System.out.println("Enter the lenght of third side");
        double side3 = sc.nextDouble();
        if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
            Triangle myTriangle = new Triangle(side1,side2,side3,"red");
            System.out.println(myTriangle);
        }
        else{
            System.out.println("Invaild input!");
        }
    }
}
