package src.Practice;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = 2018;
        System.out.println("Enter your birth year");
        int birth = sc.nextInt();
        int age = current - birth;
        System.out.print("Your age is: " + age);
    }
}
