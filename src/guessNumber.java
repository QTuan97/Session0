package src;
import java.util.Scanner;
public class guessNumber {
    public static void main(String[] args) {
        int lottery = 00;
        int specialPrize = 68;
        int fristPrize = 13;
        int secondPrize = 26;
        int thirdPrize = 37;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your frist digit ");
        String fristNum = sc.nextLine();
        System.out.print("Enter your second digit ");
        String secondNum = sc.nextLine();
        String finalNumber = fristNum + secondNum;
        lottery = Integer.parseInt(finalNumber);
        if(lottery == specialPrize){
            System.out.print("You have won 10000$ !");
        } else if(lottery == fristPrize){
            System.out.print("You have won 5000$ !");
        } else if(lottery == secondPrize){
            System.out.print("You have won 3000$ !");
        } else if(lottery == thirdPrize){
            System.out.print("You have won 1000$ !");
        } else {
            System.out.print("You have won nothing !");
        }
    }
}
