import java.math.BigInteger;

public class Problem1
{
    public static void main(String[] args)
    {
        StringBuilder strNum = new StringBuilder("1");
        strNum.append("0".repeat(49));

        BigInteger longNum = new BigInteger(strNum.toString());

        for(int i = 0; i < 10; longNum = longNum.add(BigInteger.ONE))
        {
            if(longNum.remainder(BigInteger.TWO) == BigInteger.ZERO ||
               longNum.remainder(BigInteger.valueOf(3)) == BigInteger.ZERO)
            {
                System.out.println(longNum);
                ++ i;
            }
        }
    }
}
