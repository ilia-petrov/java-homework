import java.util.Date;

public class GeometricObject
{
    private String color;
    private boolean filled;
    private Date dateCreated = new Date();

    public GeometricObject() {}

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public String toString()
    {
        return "Colour:\t" + color +
                "\nFilled:\t" + filled +
                "\nDate created:\t" + dateCreated.toString();
    }
}

