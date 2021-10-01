public class Circle {
    public double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double _radius){
        radius = _radius;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double _radius)
    {
        if(_radius < 0)
        {
            System.out.println("Error");
            return;
        }
        radius = _radius;
    }
}
