import java.util.Scanner;

public class Problem1Shuffle {
    public static void swap(int[] array, int i, int j)
    {
        int buff = array[i];
        array[i] = array[j];
        array[j] = buff;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        for(int i = 0; i < numbers.length; ++ i)
        {
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < numbers.length; ++ i)
        {
            int newIndex = (int)(Math.random() * 10);
            swap(numbers, i, newIndex);
        }

        for(int number : numbers)
        {
            System.out.print(number + " ");
        }
    }
}
