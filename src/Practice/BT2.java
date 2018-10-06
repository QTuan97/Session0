package src.Practice;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input Celsius temp ");
    double Cel = sc.nextDouble();
    double Fah = Cel * 9 / 5 + 32;
    System.out.print("Change to Fahrenheit: "  + Fah);
    }
}
