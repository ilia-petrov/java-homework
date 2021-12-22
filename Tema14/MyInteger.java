public class MyInteger
{
    private int value;

    public MyInteger(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public static boolean isEven(int x)
    {
        return x % 2 == 0;
    }

    public static boolean isOdd(int x)
    {
        return !MyInteger.isEven(x);
    }

    public static boolean isPrime(int x)
    {
        if(x == 1)
        {
            return false;
        }

        for(int i = 2; i < x; ++ i)
        {
            if(x % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static boolean isEven(MyInteger x)
    {
        return MyInteger.isEven(x.value);
    }

    public static boolean isOdd(MyInteger x)
    {
        return MyInteger.isOdd(x.value);
    }

    public static boolean isPrime(MyInteger x)
    {
        return MyInteger.isPrime(x.value);
    }

    public boolean isEven()
    {
        return MyInteger.isEven(this);
    }

    public boolean isOdd()
    {
        return  MyInteger.isOdd(this);
    }

    public boolean isPrime()
    {
        return MyInteger.isPrime(this);
    }

    public boolean equals(int other)
    {
        return this.value == other;
    }

    public boolean equals(MyInteger other)
    {
        return this.equals(other.value);
    }

    public static int parseInt(char[] str)
    {
        int forParse = 0;
        for(int i = 0; i < str.length; ++ i)
        {
            if(str[i] < '0' || str[i] > '9')
            {
                System.out.println("Error");
                return 0;
            }
            forParse *= 10;
            forParse += str[i] - '0';
        }

        return forParse;
    }

    public static int parseInt(String str)
    {
        int forParse = 0;
        for(int i = 0; i < str.length(); ++ i)
        {
            if(str.charAt(i) < '0' || str.charAt(i) > '9')
            {
                System.out.println("Error");
                return 0;
            }
            forParse *= 10;
            forParse += str.charAt(i) - '0';
        }

        return forParse;
    }
}
