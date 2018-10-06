package src;

import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your String is: Hello World");
        int count = 0;
        System.out.println("Enter a letter to count");
        char letter = input.next().charAt(0);
        String str = "Hello World";
        int len = str.length();
        for(int i = 0; i < len; i++){
            if(str.charAt(i) == letter ){
                count++;
            }
        }
        System.out.println("A letter appear " + count + " times");
    }
}
