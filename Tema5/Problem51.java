import java.util.Scanner;

public class Problem51 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int l, w, h;
        System.out.println("Length?");
        l = sc.nextInt();
        System.out.println("Width?");
        w = sc.nextInt();
        System.out.println("Height?");
        h = sc.nextInt();

        int area = 2 * (l + w) * h + l * w;
        int big = area / 140;
        area %= 140;
        if(area > 90)
        {
            System.out.println((big + 1) + " big");
            return;
        }
        int small = (area + 29) / 30;
        System.out.println(big + " big + " + small + " small");
    }
}
