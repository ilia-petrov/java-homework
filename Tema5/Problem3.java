import java.util.Scanner;

public class Problem3 {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of the up left point and the down right of the first rectangular.");

        Rectangular f = new Rectangular(new Point(sc.nextInt(), sc.nextInt()),
                                        new Point(sc.nextInt(), sc.nextInt()));
        //System.out.println("Do the same for the second rectangular.");
        Rectangular s = new Rectangular(new Point(sc.nextInt(), sc.nextInt()),
                                        new Point(sc.nextInt(), sc.nextInt()));


        if(f.isPointIn(s.u) && f.isPointIn(s.d))
        {
            System.out.println("Second is in first.");
            return;
        }
        if(s.isPointIn(f.u) && s.isPointIn(f.d))
        {
            System.out.println("First is in second.");
            return;
        }
        System.out.println("Neither of the rectangles is contained in the other.");
    }
}
