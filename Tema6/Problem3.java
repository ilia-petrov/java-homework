import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;

        System.out.println("Enter n:");
        n = sc.nextInt();
		while(n > 0)
        {
            sum += (1.0 / n);
            n --;
        }

        System.out.println(sum);
	}
}
