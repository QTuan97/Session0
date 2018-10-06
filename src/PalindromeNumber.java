package src;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check");
        int number = sc.nextInt();
        int revnumber = getReverse(number);
        if(isPalindrome(number,revnumber)){
            System.out.println("Your number is palindrome");
        }else {
            System.out.println("Your number is not palindrome");
        }
    }
    public static int getReverse(int number){
        int reverse = 0;
        while(number != 0){
            reverse = reverse * 10;
            reverse = reverse + number%10;
            number = number/10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number, int reverse){
        if(number == reverse){
            return true;
        }
        return false;
    }
}
