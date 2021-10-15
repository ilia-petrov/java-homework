public class Fan
{
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean switchedOn = false;
    private double radius = 5;
    private String colour = "Blue";

    public Fan() {}

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public boolean isSwitchedOn()
    {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn)
    {
        this.switchedOn = switchedOn;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String toString()
    {
        String output = "Colour: " + colour + "\nRadius: " + Double.toString(radius) + "\n";

        if(switchedOn)
        {
            output += "Speed: " + Integer.toString(speed);
        }else
        {
            output += "The fan is not switched on.";
        }

        return output;
    }
}
