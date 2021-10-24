import java.util.Scanner;

public class Problem1Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean isPalindrome = true;
        for(int i = 0; i < str.length() / 2 && isPalindrome; ++ i)
        {
            isPalindrome &= (str.charAt(i) == str.charAt(str.length() - i - 1));
        }

        System.out.println(isPalindrome);
    }
}
