package src;
import java.util.Scanner;
public class deleteFromArray {
    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5,6,7,8,0,0};
        System.out.println("Your current array is {1,2,3,4,5,6,7,8,0,0}");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to delete: ");
        int input = sc.nextInt();

        for(int i = 0; i < Array.length; i++){
            if(Array[i] == input){
                for(int j = i;j < Array.length - 1; j++){
                    Array[j] = Array[j+1];
                }
                break;
            }
        }

        System.out.println("Your current Array");
        for(int i = 0; i < Array.length; i++){
            System.out.print(" " + Array[i]);
        }
    }
}
