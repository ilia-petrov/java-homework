import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double yearInterestRate = 0;
    private Date dateCreated = new Date();

    public Account() {
        this.id = 0;
        this.balance = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getYearInterestRate() {
        return yearInterestRate;
    }

    public static void setYearInterestRate(double yearInterestRate) {
        Account.yearInterestRate = yearInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate()
    {
        return yearInterestRate / 12;
    }

    public double getMonthlyInterest()
    {
        return getMonthlyInterestRate() * balance / 100;
    }

    public void withdraw(double sum)
    {
        if(sum < 0 || sum > balance)
        {
            return;
        }

        balance -= sum;
    }

    public void deposit(double sum)
    {
        if(sum < 0)
        {
            return;
        }

        balance += sum;
    }
}
