package src;

public class Rectangular
{
    private double height;
    private double width;
    private String colour;

    public Rectangular()
    {
        this.height = 1;
        this.width = 1;
    }

    public Rectangular(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea()
    {
        return this.width * this.height;
    }

    public double getPerimeter()
    {
        return 2 * (this.height + this.width);
    }
}
