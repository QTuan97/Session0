package src;

import java.util.Scanner;

public class changeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1.Change from meter to foot");
            System.out.println("2.Change from foot to meter");
            System.out.println("3.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value in meter ");
                    double meter = sc.nextDouble();
                    System.out.print("Change into foot: " + meterToMeter(meter));
                    break;
                case 2:
                    System.out.println("Enter the value in foot ");
                    double foot = sc.nextDouble();
                    System.out.println("Change into meter: " + footToMeter(foot));
                    break;
                case 3:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double meterToMeter(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
    public static double footToMeter(double foot){
        double meter =  0.305 * foot;
        return meter;
    }

}

