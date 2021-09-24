public class Problem1 {
    public static void main(String[] args)
    {
        for(char ch = '!'; ch <= '~';)
        {
            String output = "";
            for(int i = 0; i < 10 && ch <= '~'; ++ i, ++ ch)
            {
                output += ch + " ";
            }
            System.out.println(output);
        }
    }
}
