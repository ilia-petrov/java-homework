import java.util.Scanner;

public class Problem1
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {


        Account[] accounts = new Account[10];
        for(int i = 0; i < accounts.length; ++ i)
        {
            accounts[i] = new Account(i, 100);
        }

        while(true)
        {
            System.out.println("Enter id:");
            int id = sc.nextInt();

            if(id < 0 || id >= accounts.length)
            {
                System.out.println("Wrong id");
                continue;
            }

            mainMenu(accounts, id);
        }
    }

    public static void mainMenu(Account[] accounts, int id)
    {
        while(true)
        {
            printMenu();
            int choice = sc.nextInt();
            manageChoice(accounts, id, choice);
            if(choice == 4)
            {
                return;
            }
        }
    }

    public static void manageChoice(Account[] accounts, int id, int choice)
    {
        switch (choice)
        {
            case 1 -> System.out.println("The balance is " + accounts[id].getBalance());
            case 2 ->
            {
                System.out.print("Enter amount to withdraw: ");
                int money = sc.nextInt();
                accounts[id].withdraw(money);
            }
            case 3 ->
            {
                System.out.print("Enter amount to deposit: ");
                int money = sc.nextInt();
                accounts[id].deposit(money);
            }
            case 4 -> {}
            default -> System.out.println("Wrong choice");
        }
    }

    public static void printMenu()
    {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.print("Enter a choice: ");
    }
}