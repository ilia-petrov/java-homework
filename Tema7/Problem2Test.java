public class Problem2Test {
    public static void main(String[] args)
    {
        Circle c1 = new Circle(1), c2 = new Circle(), c3 = new Circle(125);
        c2.setRadius(25);
        System.out.println("Area of first is: " + c1.getArea());
        System.out.println("Perimeter of third is: " + c3.getPerimeter());
    }
}
