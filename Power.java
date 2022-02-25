public class Power {
    public static void main(String[] args) {
        System.out.println(powrec(2, 5));
        System.out.println(pownereck(2, 5));
    }

    private static double pownereck(double x, int n) {
        double res = 1;
        for(int i = 0; i < n; ++ i)
        {
            res *= x;
        }

        return res;
    }

    private static double powrec(double x, int n) {
        if(n == 0)
        {
            return 1;
        }
        double res = powrec(x, n / 2);
        res = res * res;
        if(n % 2 == 1)
        {
            res *= x;
        }
        return res;
    }


}
