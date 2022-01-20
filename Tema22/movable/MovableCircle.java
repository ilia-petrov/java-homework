package movable;

public class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center)
    {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString()
    {
        return "Center: " + center.toString() + "\nRadius: " + radius;
    }

    @Override
    public void moveUp()
    {
        center.moveUp();
    }

    @Override
    public void moveDown()
    {
        center.moveDown();
    }

    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }

    @Override
    public void moveRight()
    {
        center.moveRight();
    }
}
