import java.util.Date;

public class Staff extends Employee
{
    private String title;

    public Staff() {}

    public Staff(String title)
    {
        this.title = title;
    }

    public Staff(String name, String address, String phoneNumber, String email, int office, double salary, Date dateHired, String title)
    {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String toString()
    {
        return  super.toString() +
                "\nTitle: " + title;
    }
}
