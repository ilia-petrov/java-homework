import java.util.Date;

public class Employee extends Person
{
    private int office;
    private double salary;
    private Date dateHired = new Date();

    public Employee() {}

    public Employee(int office, double salary, Date dateHired)
    {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, String phoneNumber, String email, int office, double salary, Date dateHired)
    {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public int getOffice()
    {
        return office;
    }

    public void setOffice(int office)
    {
        this.office = office;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public Date getDateHired()
    {
        return dateHired;
    }

    public void setDateHired(Date dateHired)
    {
        this.dateHired = dateHired;
    }

    public String toString()
    {
        return  super.toString() +
                "\nOffice: " + office +
                "\nSalary: " + salary +
                "\nDate hired: " + dateHired.toString();
    }
}
