import java.util.Scanner;

public class Problem2SSN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter security number:");
        String number = sc.nextLine();

        if(number.matches("\\d{3}-\\d{2}-\\d{4}"))
        {
            System.out.println("Correct SSN.");
        }else
        {
            System.out.println("Incorrect SSN.");
        }
    }
}
