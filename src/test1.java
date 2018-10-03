package src;
import java.util.Arrays;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array ");
        int input = sc.nextInt();
        int[] myList = new int[input];
        System.out.print("Enter the position u want to add ");
        int index = sc.nextInt();
        if (index > myList.length || index < 0){
            System.out.println("Invaild index");
            return;
        }
        System.out.print("Enter the value ");
        int value = sc.nextInt();
        myList[index] = value;
        System.out.print(Arrays.toString(myList));
    }
}
