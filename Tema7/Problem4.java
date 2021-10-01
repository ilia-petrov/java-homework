public class Problem4 {
    public static void main(String[] args)
    {
        Stock orcl = new Stock("ORCL", "Oracle Corporation");
        orcl.currentPrice = 34.35;
        orcl.previousClosingPrice = 34.5;
        System.out.println(orcl.getChangePrice());
    }
}
