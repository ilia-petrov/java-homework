public class SavingsAccount {
    public String name;
    public double balance;

    public void deposit(double x)
    {
        if(x < 0)
        {
            System.out.println("Error.");
            return;
        }
        balance += x;
    }

    public void withdraw(double x)
    {
        if(x > balance)
        {
            System.out.println("Balance is too low.");
            return;
        }
        if(x < 0)
        {
            System.out.println("Error");
            return;
        }
        balance -= x;
        System.out.println(balance);
    }

    public SavingsAccount(String _name, double _balance)
    {
        name = _name;
        balance = _balance;
    }
}
