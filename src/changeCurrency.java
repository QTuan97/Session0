package src;
import java.util.Scanner;
public class changeCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount of money in USD ");
        double USD = sc.nextDouble();
        double VND = USD * 23000;
        System.out.println("Your money in VND is: " + VND);
    }
}