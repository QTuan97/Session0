package src;
import java.util.Scanner;
public class Pentagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int input = sc.nextInt();
        if(input < 1){
            System.out.print("Invalid number");
            return;
        }
        int result = (input*(3*input-1))/2;
        System.out.print("Your pentagonal number is: " + result);
    }
}
