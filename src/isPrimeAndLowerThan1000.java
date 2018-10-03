package src;

public class isPrimeAndLowerThan1000 {
    public static void main(String[] args) {
        for(int i = 2; i < 1000;i++){
            if(isPrime(i)){
                System.out.println(i + " is prime and lower than 1000");
            }
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
