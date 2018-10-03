package src;
import java.util.Scanner;
public class printShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu.");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 7; j++){
                            if( i == 0 || i == 3)
                                System.out.print("*");
                            else if(j == 0 || j == 3)
                                System.out.print("*");
                            else System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for(int i = 1; i <=6;++i){
                        for(int j = 1; j<i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int i = 5; i >=1;--i){
                        for(int j = 1; j <=i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }while (choice != 0);
    }
}
