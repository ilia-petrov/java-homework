import java.util.Scanner;

public class Problem4Anagrams
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if(areAnagrams(word1, word2))
        {
            System.out.println("These are anagrams");
        }else
        {
            System.out.println("These aren't anagrams");
        }
    }

    public static boolean areAnagrams(String word1, String word2)
    {
        int[] used = new int[26];

        for(int i = 0; i < word1.length(); ++ i)
        {
            ++ used[word1.charAt(i) - 'a'];
        }

        for(int i = 0; i < word2.length(); ++ i)
        {
            -- used[word2.charAt(i) -'a'];
        }

        for(int i = 0; i < 26; ++ i)
        {
            if(used[i] != 0)
            {
                return false;
            }
        }

        return true;
    }
}
