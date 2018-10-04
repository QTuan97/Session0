package src.priceChangePercentage;

public class percentage {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public percentage(){
    }
    public percentage(String symbol, String name, double previousClosingPrice,double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    public double getChangePercent(){
        return (this.previousClosingPrice - this.currentPrice)/this.previousClosingPrice * 100;
    }
}
