package src;
import java.util.Scanner;
public class sortNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter frist num ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second num ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third num ");
        double num3 = sc.nextDouble();
        displaySortedNumbers(num1,num2,num3);
    }

    public static void displaySortedNumbers( double num1, double num2, double num3){
        if(num1 > num2 && num2 > num3){
            System.out.print("Sorted Numbers: " + num3 + "," + num2 + "," + num1);
        }
        if(num1 > num3 && num3 > num2){
            System.out.print("Sorted Numbers: " + num2 + "," + num3 + "," + num1);
        }
        if(num2 > num1 && num1 > num3){
            System.out.print("Sorted Numbers: " + num3 + "," + num1 + "," + num2);
        }
        if(num2 > num3 && num3 > num1){
            System.out.print("Sorted Numbers: " + num1 + "," + num3 + "," + num2);
        }
        if(num3 > num1 && num1 > num2){
            System.out.print("Sorted Numbers: " + num2 + "," + num1 + "," + num3);
        }
        if(num3 > num2 && num2 > num1){
            System.out.print("Sorted Numbers: " + num1 + "," + num2 + "," + num3);
        }
    }
}
