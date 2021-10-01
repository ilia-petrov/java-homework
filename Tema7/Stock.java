public class Stock {
    public String symbol, name;
    public double previousClosingPrice, currentPrice;

    public Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePrice()
    {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
