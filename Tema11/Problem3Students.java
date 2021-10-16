import java.util.Scanner;

public class Problem3Students
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter key without spaces:");
        String key = sc.nextLine();

        String[] studentsAnswers = new String[8];
        int[] score = new int[8];
        for(int i = 0; i < 8; ++ i)
        {
            System.out.println("Enter answers of student #" + (i + 1) + ":");
            studentsAnswers[i] = sc.nextLine();
            for(int j = 0; j < key.length(); ++ j)
            {
                score[i] += (key.charAt(j) == studentsAnswers[i].charAt(j) ? 1 : 0);
            }
        }

        for(int i = 0; i < 8; ++ i)
        {
            System.out.println("Score of student #" + (i + 1) + " is: " + score[i]);
        }
    }
}
