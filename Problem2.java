import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of lines");
        n = sc.nextInt();

        for(int i = n; i > 0; -- i)
        {
            for(int j = 0; j < n - i; ++ j)
            {
                System.out.print("  ");
            }
            for(int j = 0; j < i; ++ j)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
