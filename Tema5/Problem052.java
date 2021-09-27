import java.util.Scanner;

public class Problem052 {
    static int[] d = new int[9];

    public static void getDigs(int x)
    {
        for(int i = 0; x > 0 && i < 9; x /= 10, i ++)
        {
            d[8 - i] = x % 10;
        }
    }

    public static void main(String[] args)
    {
        //(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11

        Scanner sc = new Scanner(System.in);
        System.out.println("ISBN?");
        String nineDigsS = sc.nextLine();
        int nineDigs = Integer.parseInt(nineDigsS);

        getDigs(nineDigs);

        int tenth = 0;
        for(int i = 0; i < 9; ++ i)
        {
            tenth += d[i] * (i + 1);
        }
        tenth %= 11;
        System.out.println(nineDigsS + (tenth == 10 ? "X" : Integer.toString(tenth)));
    }
}
