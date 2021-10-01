public class Problem1 {
    public static void main(String[] args)
    {
        SavingsAccount _1 = new SavingsAccount("Joe", 30.08);

        _1.deposit(100);
        _1.withdraw(200);
        _1.withdraw(-50);
        _1.withdraw(50);
    }
}
