import java.util.Date;

public class Faculty extends Employee
{
    private double officeHours;
    private String rank;

    public Faculty() {}

    public Faculty(double officeHours, String rank)
    {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String name, String address, String phoneNumber, String email, int office, double salary, Date dateHired, double officeHours, String rank)
    {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public double getOfficeHours()
    {
        return officeHours;
    }

    public void setOfficeHours(double officeHours)
    {
        this.officeHours = officeHours;
    }

    public String getRank()
    {
        return rank;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public String toString()
    {
        return  super.toString() +
                "\nOffice hours: " + officeHours +
                "\nRank: " + rank;
    }
}
