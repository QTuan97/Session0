package src.StopWatch;

import java.util.Scanner;

public class Watch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        setup StopWatch0 = new setup();
        int choice;
        do {
            System.out.print("Press 1 to start and press 0 to get time ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Starting");
                    int count = 0;
                    StopWatch0.start();
                    for (int i = 0; i < 104440000; i++) {
                        count += 12323;
                    }
                case 0:
                    StopWatch0.end();
                    break;
                default:
                    System.out.println("Invaild input! ");

            }
        }while (choice != 0);
        System.out.println("It takes " + (StopWatch0.getElapsedTime()/1000) + " seconds");
    }
}
