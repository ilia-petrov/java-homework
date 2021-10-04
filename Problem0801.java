package src;

public class Problem0801 {
    public static void main(String[] args)
    {
        Student st = new Student("GNa", 6);
        System.out.println(isForScholarship(st));
    }

    static boolean isForScholarship(Student st)
    {
        if(st.note >= 5.5)
        {
            st.balance += 100;
            return true;
        }

        return false;
    }
}
