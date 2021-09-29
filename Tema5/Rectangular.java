public class Rectangular {
    public Point u, d;

    public boolean isPointIn(Point p)
    {
        if((p.x >= u.x) && (p.y <= d.x) && (p.y >= u.y) && (p.y <= d.y))
        {
            return true;
        }
        return false;
    }

    public Rectangular(Point _u, Point _d)
    {
        u = _u;
        d = _d;
    }
}
