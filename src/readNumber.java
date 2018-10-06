package src;

import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 99");
        int number = sc.nextInt();
        int digit = 0;
        if(number < 20 && number >= 0){
            switch (number) {
                case 0:
                    System.out.println("Your number is: Zero");
                    break;
                case 1:
                    System.out.println("Your number is: One");
                    break;
                case 2:
                    System.out.println("Your number is: Two");
                    break;
                case 3:
                    System.out.println("Your number is: Three");
                    break;
                case 4:
                    System.out.println("Your number is: Four");
                    break;
                case 5:
                    System.out.println("Your number is: Five");
                    break;
                case 6:
                    System.out.println("Your number is: Six");
                    break;
                case 7:
                    System.out.println("Your number is: Seven");
                    break;
                case 8:
                    System.out.println("Your number is: Eight");
                    break;
                case 9:
                    System.out.println("Your number is: Nine");
                    break;
                case 10:
                    System.out.println("Your number is: Ten");
                    break;
                case 11:
                    System.out.println("Your number is: Eleven");
                    break;
                case 12:
                    System.out.println("Your number is: Twelve");
                    break;
                case 13:
                    System.out.println("Your number is: Thridteen");
                    break;
                case 14:
                    System.out.println("Your number is: Fourteen");
                    break;
                case 15:
                    System.out.println("Your number is: Fifthteen");
                    break;
                case 16:
                    System.out.println("Your number is: Sixteen");
                    break;
                case 17:
                    System.out.println("Your number is: Seventeen");
                    break;
                case 18:
                    System.out.println("Your number is: Eighteen");
                    break;
                case 19:
                    System.out.println("Your number is: Nineteen");
                    break;
            }
        }
        else if(number > 99){
            System.out.println("Your number is out of range!");
        }
        else {
            String read = " ";
            String digit1Read = " ";
            String digit2Read = " ";
            while (number > 0) {
                digit = number % 10;
                if (number >= 20)
                    switch (digit) {
                        case 1:
                            digit1Read = "one";
                            break;
                        case 2:
                            digit1Read = "two";
                            break;
                        case 3:
                            digit1Read = "three";
                            break;
                        case 4:
                            digit1Read = "four";
                            break;
                        case 5:
                            digit1Read = "five";
                            break;
                        case 6:
                            digit1Read = "six";
                            break;
                        case 7:
                            digit1Read = "seven";
                            break;
                        case 8:
                            digit1Read = "eight";
                            break;
                        case 9:
                            digit1Read = "nine";
                            break;
                    }
                if (number < 10) {
                    switch (digit) {
                        case 2:
                            digit2Read = "Twenty";
                            break;
                        case 3:
                            digit2Read = "Thridty";
                            break;
                        case 4:
                            digit2Read = "Fourty";
                            break;
                        case 5:
                            digit2Read = "Fifty";
                            break;
                        case 6:
                            digit2Read = "Sixty";
                            break;
                        case 7:
                            digit2Read = "Seventy";
                            break;
                        case 8:
                            digit2Read = "Eighty";
                            break;
                        case 9:
                            digit2Read = "Ninety";
                            break;
                    }
                }
                number = number / 10;
            }
            read = digit2Read + digit1Read;
            System.out.println("Your number is: " + read);
        }
    }
}

