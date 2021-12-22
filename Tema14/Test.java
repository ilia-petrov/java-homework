import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Time t1 = new Time();
        Time t2 = new Time(12, 40, 5);
        Time t3 = new Time(555550000);

        System.out.printf("%d %d %d\n", t1.getHour(), t1.getMinute(), t1.getSecond());
        System.out.printf("%d %d %d\n", t2.getHour(), t2.getMinute(), t2.getSecond());
        System.out.printf("%d %d %d\n", t3.getHour(), t3.getMinute(), t3.getSecond());

        MyInteger m1 = new MyInteger(MyInteger.parseInt(sc.nextLine()));
        System.out.println(m1.getValue());

        MyPoint mp1 = new MyPoint(1.5, 2);
        MyPoint mp2 = new MyPoint();

        System.out.println(mp1.distance(mp2.getX(), mp2.getY()));
        System.out.println(mp1.distance(mp2));
        System.out.println(MyPoint.distance(mp1, mp2));
    }
}
