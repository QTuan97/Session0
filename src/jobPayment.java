package src;

import java.util.Scanner;

public class jobPayment {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter year ");
    int year = sc.nextInt();
    if(year <= 2){
        int x = 2;
        int payment = 4000000 * x  + year * 500000;
        System.out.print("Your payment this month is: " + payment);
    }else if (year < 5 && year >= 3){
        int x = 3;
        int payment = 4000000 * x  + year * 500000;
        System.out.print("Your payment this month is: " + payment);
    }else {
        int x = 5;
        int payment = 4000000 * x  + year * 500000;
        System.out.print("Your payment this month is: " + payment);
    }
    }
}
