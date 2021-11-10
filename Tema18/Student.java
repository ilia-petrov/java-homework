public class Student extends Person
{
    private int classStatus = 1;

    public Student() {}

    public Student(int classStatus)
    {
        this.classStatus = classStatus;
    }

    public Student(String name, String address, String phoneNumber, String email, int classStatus)
    {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    public int getClassStatus()
    {
        return classStatus;
    }

    public void setClassStatus(int classStatus)
    {
        this.classStatus = classStatus;
    }

    public String toString()
    {
        return  super.toString() +
                "\nClass status: " + classStatus;
    }
}
