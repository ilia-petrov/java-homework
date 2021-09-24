import java.util.Scanner;

public class Problem4 {
    static String[] months =  {"January",
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
        switch (month)
        {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11: return 31; break;
            case 3:
            case 5:
            case 8:
            case 10: return 30; break;
            default: return (year % 100 != 0 && year % 4 == 0) || year % 400 == 0 ? 29 : 28;
        }
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
            int days = findDays(i, year);
            print initSpaces(fday);
        }
    }
}
