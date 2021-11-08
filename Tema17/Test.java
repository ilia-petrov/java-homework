import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Side1?");
        double side1 = sc.nextDouble();
        System.out.println("Side2?");
        double side2 = sc.nextDouble();
        System.out.println("Side3?");
        double side3 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Color?");
        String color = sc.nextLine();
        System.out.println("Filled?");
        boolean filled = sc.nextLine().equals("true");

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("Area:\t" + triangle.getArea());
        System.out.println("Perimeter:\t" + triangle.getPerimeter());
        System.out.println(triangle.toString());
    }
}
