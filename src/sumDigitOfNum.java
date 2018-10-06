package src;

import java.util.Scanner;

public class sumDigitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int digit,sum = 0;
        while (number > 0){
            digit = number % 10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println("Sum of your number's digit: " + sum);
    }
}
