import java.util.Scanner;

public class Problem3Password
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        String password = sc.nextLine();

        if(isValidPassword(password))
        {
            System.out.println("Valid password");
        }else
        {
            System.out.println("Invalid password");
        }
    }

    public static boolean isValidPassword(String password)
    {
        return (password.length() >= 8) &&
                (isOnlyLettersAndDigits(password)) &&
                (numberOfDigits(password) >= 2);
    }

    public static boolean isOnlyLettersAndDigits(String password)
    {
        for(int i = 0; i < password.length(); ++ i)
        {
            char currentChar = password.charAt(i);
            if(!(('a' <= currentChar && currentChar <= 'z') ||
                    ('A' <= currentChar && currentChar <= 'Z') ||
                    ('0' <= currentChar && currentChar <= '9')))
            {
                return false;
            }
        }

        return true;
    }

    public static int numberOfDigits(String password)
    {
        int count = 0;
        for(int i = 0; i < password.length(); ++ i)
        {
            char currentChar = password.charAt(i);
            count += ('0' <= currentChar && currentChar <= '9' ? 1 : 0);
        }

        return count;
    }
}
