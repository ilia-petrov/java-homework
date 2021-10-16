import java.util.Scanner;

public class Test
{
    public static void main(String args[])
    {
        final int SIZE = 100000;
        int[] array = new int[SIZE];
        for(int i = 0; i < SIZE; ++ i)
        {
            array[i] = SIZE - i;
        }

        StopWatch selectionSortTime = new StopWatch();

        selectionSortTime.start();
        selectionSort(array);
        selectionSortTime.stop();

        System.out.println(selectionSortTime.getElapsedTime());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns in the array :");
        int rows = sc.nextInt(), columns = sc.nextInt();
        double[][] array2 = new double[rows][columns];
        System.out.println("Enter the array:");
        for(int i = 0; i < rows; ++ i)
        {
            for(int j = 0; j < columns; ++ j)
            {
                array2[i][j] = sc.nextDouble();
            }
        }

        Location location = Location.locateLargest(array2);
        System.out.println(Location.toString(location));
    }

    public static void selectionSort(int[] array)
    {
        for(int i = 0; i < array.length; ++ i)
        {
            int min = array[i], minIndex = i;
            for(int j = i + 1; j < array.length; ++ j)
            {
                if(array[j] < min)
                {
                    min = array[j];
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
