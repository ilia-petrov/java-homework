import java.util.Scanner;

public class Problem3 {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Rectangular f = new Rectangular(new Point(sc.nextInt(), sc.nextInt()),
                                        new Point(sc.nextInt(), sc.nextInt())),
                    s = new Rectangular(new Point(sc.nextInt(), sc.nextInt()),
                                        new Point(sc.nextInt(), sc.nextInt()));


        System.out.println(f.isPointIn(s.u) && f.isPointIn(s.d));
    }
}
