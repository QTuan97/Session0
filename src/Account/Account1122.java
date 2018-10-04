package src.Account;

public class Account1122 {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setId(1122);
        acc1.setBalance(20000.0);
        acc1.setAnnualInterestRate(0.045);
        acc1.setDateCreated(115,0,10);
        System.out.println("You have withdraw " + acc1.withdraw());
        System.out.println("You have deposited " + acc1.deposit(3000.0));
        System.out.println("Your account have $" + acc1.getBalance() + " ,your monthly interest is "
                + acc1.getMonthlyInterestRate() + " and your created date is " + acc1.getDateCreated());
    }

}
