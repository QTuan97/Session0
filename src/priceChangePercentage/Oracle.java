package src.priceChangePercentage;

public class Oracle {
    public static void main(String[] args) {
        percentage OrcPercent = new percentage("ORCL", "Oracle", 34.5, 34.35);
        System.out.printf("The change percent is:" + " %.3f%% " , OrcPercent.getChangePercent());
    }
}
