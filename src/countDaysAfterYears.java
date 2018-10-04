package src;

import java.util.Scanner;

public class countDaysAfterYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end year");
        int end = sc.nextInt();
        System.out.println("There are " + numberOfDaysInAYear(end) + " days");
    }
    public static int numberOfDaysInAYear(int year){
        int count = 0;
        for(int i = 2000; i <= year; i++){
            if(i % 4 == 0){
                if(i % 100 == 0){
                    if(i % 400 == 0){
                        count += 366;
                    } else {
                        count += 365;
                    }
                } else {
                    count += 366;
                }
            } else {
                count += 365;
            }
        }
        return count;
    }
}
