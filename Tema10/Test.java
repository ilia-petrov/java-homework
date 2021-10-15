public class Test {
    public static void main(String[] args)
    {
        Fan fan1 = new Fan(), fan2 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColour("Yellow");
        fan1.setSwitchedOn(true);

        fan2.setSpeed(Fan.MEDIUM);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

        Account acc = new Account(1122, 20000);
        Account.setYearInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Monthly interest: " + acc.getMonthlyInterest());
        System.out.println("Date created: " + acc.getDateCreated());
    }
}
