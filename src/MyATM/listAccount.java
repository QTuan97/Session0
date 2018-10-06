package src.MyATM;

public class listAccount {
    private int size;
    private int id = 0;
    setupATM[] listAccount = new setupATM[10];
    public void add(setupATM account){
        listAccount[size] = account;
        account.setId(id);
        id++;
        size++;
    }
}
