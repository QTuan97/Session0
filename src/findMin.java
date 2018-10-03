package src;
import java.util.Scanner;
public class findMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of unit in array ");
        int size = sc.nextInt();
        int[] numList = new int[size];
        for(int i = 0; i < numList.length; i++){
            System.out.print("Enter the number at positon " + i + " " );
            int input = sc.nextInt();
            numList[i] = input;
        }

        System.out.print("The result is " + findMinNum(numList));
    }
    static int findMinNum(int[] numList){
        int min = numList[0];
        for(int j : numList){
            if(j < min){
                min = j;
            }
        }
        return min;
    }
}
