public class MyPoint
{
    private double x;
    private double y;

    public MyPoint()
    {
        this(0, 0);
    }

    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double distance(MyPoint other)
    {
        return MyPoint.distance(this, other);
    }

    public double distance(double otherX, double otherY)
    {
        return this.distance(new MyPoint(otherX, otherY));
    }

    public static double distance(MyPoint first, MyPoint second)
    {
        return Math.sqrt((first.x - second.x) * (first.x - second.x) +
                         (first.y - second.y) * (first.y - second.y));
    }
}
