package src.MyIntegerClass;

import java.util.Scanner;

public class MyIntegerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number you want to use: ");
        int yourNumber = sc.nextInt();
        MyInteger setNumber = new MyInteger();
        MyInteger myNum = new MyInteger();
        myNum.setValue(yourNumber);
        setNumber.setValue(10);
        System.out.println(myNum.isEven());
        System.out.println(myNum.isOdd());
        System.out.println(myNum.isPrime());
        System.out.println(setNumber.isEven());
        System.out.println(setNumber.isOdd());
        System.out.println(setNumber.isPrime());
        System.out.println(setNumber.equals(myNum.getValue()));
    }
}
