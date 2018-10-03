package src;
import java.util.Scanner;
public class countString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string ");
        String input = sc.nextLine();
        System.out.println("There are " + countLetters(input) + " letters");
    }
    public static int countLetters(String s){
        int count = 0;
        for(int i = 0; i < s.length();i++){
            if(Character.isLetter(s.charAt(i)))
                count++;
        }
        return count;
    }
}
