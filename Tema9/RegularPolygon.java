public class RegularPolygon
{
    private int n;
    private double sideLength;
    private double x;
    private double y;

    public RegularPolygon()
    {
        n = 3;
        sideLength = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n, double sideLength)
    {
        this.n = n;
        this.sideLength = sideLength;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n, double sideLength, double x, double y)
    {
        this.n = n;
        this.sideLength = sideLength;
        this.x = x;
        this.y = y;
    }

    public int getN()
    {
        return n;
    }

    public void setN(int n)
    {
        this.n = n;
    }

    public double getSideLength()
    {
        return sideLength;
    }

    public void setSideLength(double sideLength)
    {
        this.sideLength = sideLength;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getPerimeter()
    {
        return n * sideLength;
    }

    public double getArea()
    {
        return (n * sideLength * sideLength) / (4 * Math.tan(Math.PI / n));
    }
}
