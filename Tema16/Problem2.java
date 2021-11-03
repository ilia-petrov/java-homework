import java.math.BigInteger;

public class Problem2
{
    public static void main(String[] args)
    {
        BigInteger longNum = new BigInteger(Long.toString(Long.MAX_VALUE));
        for(int i = 0; i < 10; longNum = longNum.add(BigInteger.ONE))
        {
            if(longNum.remainder(BigInteger.valueOf(5)) == BigInteger.ZERO
            || longNum.remainder(BigInteger.valueOf(6)) == BigInteger.ZERO)
            {
                System.out.println(longNum);
                ++ i;
            }
        }
    }
}
