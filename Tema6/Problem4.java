import java.util.Scanner;

public class Problem4 {
    static String[] months =  { "January",
                                "February",
                                "March",
                                "April",
                                "May",
                                "June",
                                "July",
                                "August",
                                "September",
                                "October",
                                "November",
                                "December"};

    public static void printMonth(String month)
    {
        System.out.println("\t\t\t\t\t\t" + month);
        for(int i = 0; i < 8 * 7; ++ i)
        {
            System.out.print("-");
        }
        System.out.println( "\nMon\t\t" +
                            "Tue\t\t" +
                            "Wed\t\t" +
                            "Thu\t\t" +
                            "Fri\t\t" +
                            "Sat\t\t" +
                            "Sun");
    }

    public static int findDays(int month, int year)
    {
        return switch (month) {
            case 0, 2, 4, 6, 7, 9, 11 -> 31;
            case 3, 5, 8, 10 -> 30;
            default -> (year % 100 != 0 && year % 4 == 0) || year % 400 == 0 ? 29 : 28;
        };
    }

    public static void printInitSpaces(int fday)
    {
        for(int i = 0; i < fday * 2; ++ i)
        {
            System.out.print("\t");
        }
    }

    public static void printDates(int fday, int daysInMonth)
    {
        int currDay = 1;

        for(int i = fday; i < 7; ++ i, ++ currDay)
        {
            System.out.print(currDay + "\t\t");
        }
        System.out.println();

        while(currDay <= daysInMonth)
        {
            for(int i = 0; i < 7 && currDay <= daysInMonth; ++ i, ++ currDay)
            {
                System.out.print(currDay + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year, fday;


        System.out.println("Year?");
        year = sc.nextInt();
        System.out.println("1st January?");
        fday = sc.nextInt();

        for(int i = 0; i < 12; ++ i)
        {
            printMonth(months[i]);
            int daysInMonth = findDays(i, year);
            printInitSpaces(fday);
            printDates(fday, daysInMonth);
            fday = (fday + daysInMonth) % 7;
        }
    }
}
