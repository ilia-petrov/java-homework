public class Location
{
    public double maxValue = 0;
    public int maxI = 0;
    public int maxJ = 0;

    public static Location locateLargest(double array[][])
    {
        Location result = new Location();
        result.maxValue = array[0][0];
        for(int i = 0; i < array.length; ++ i)
        {
            for(int j = 0; j < array[i].length; ++ j)
            {
                if(array[i][j] > result.maxValue)
                {
                    result.maxI = i;
                    result.maxJ = j;
                    result.maxValue = array[i][j];
                }
            }
        }

        return result;
    }

    public static String toString(Location location)
    {
        return "The location of the largest element is " +
                location.maxValue + " at (" +
                location.maxI + ", " +
                location.maxJ + ")";
    }
}
