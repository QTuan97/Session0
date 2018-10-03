package src;

public class fristPrimeNum {
    public static void main(String[] args) {
        int count = 0;
        int current = 2;
        while(count < 20){
            if(isPrime(current)){
                System.out.println(current + " is prime");
                count++;
            }
            current++;
        }
    }
    static boolean isPrime(int number){
        boolean check = true;
        for (int num = 2; num < number; num++) {
            while (num <= Math.sqrt(number)) {
                if (number % num == 0) {
                    check = false;
                    break;
                }
                num++;
            }
        }
        return check;
    }
}
