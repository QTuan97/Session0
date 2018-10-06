package src.MyATM;

import java.util.Scanner;

public class MyATMtest {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        setupATM account = new setupATM();
        listAccount myList = new listAccount();
        for(int i = 0; i < 10;i++){
            myList.add(account);
        }
        System.out.println("Enter your ID");
        int id = sc.nextInt();
        if(id > 9 || id < 0){
            System.out.println("Invaild ID, please try again");
        }
        else{
                do {
                    System.out.println("Main Menu");
                    System.out.println("1: Check balance");
                    System.out.println("2: Deposit");
                    System.out.println("3: Withdraw");
                    System.out.println("4: Exit");
                    System.out.println("Enter your choice: ");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            account.checkBalance();
                            break;
                        case 2:
                            System.out.println("Enter an aount to deposit: ");
                            double amount = sc.nextDouble();
                            account.deposit(amount);
                            break;
                        case 3:
                            System.out.println("Enter an amount to withdraw: ");
                            double amount1 = sc.nextDouble();
                            account.withdraw(amount1);
                            break;
                        case 4:
                            System.exit(0);

                    }
                } while (choice != 0);
        }
    }
}

