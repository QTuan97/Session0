package src.Practice;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double rad = sc.nextDouble();
        double S = Math.PI * Math.pow(rad, 2);
        double C = Math.PI * rad * 2;
        System.out.println("Dien tich hinh tron la: " + S);
        System.out.print("Chu vi hinh tron la: " + C);
    }
}
