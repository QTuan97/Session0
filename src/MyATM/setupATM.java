package src.MyATM;
public class setupATM {
    private int id;
    private static double balance = 100;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void checkBalance(){
        System.out.println("The balance is: " + this.balance);
    }

    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }

    public double deposit(double amount){
        this.balance = this.balance + amount;
        return this.balance;
    }
}
