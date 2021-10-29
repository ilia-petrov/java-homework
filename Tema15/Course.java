public class Course
{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public Course()
    {
        this("");
    }

    public String getCourseName()
    {
        return courseName;
    }

    public String[] getStudents()
    {
        return students;
    }

    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public void addStudent(String student)
    {
        if(numberOfStudents >= students.length)
        {
            return;
        }
        students[numberOfStudents] = student;
        ++ numberOfStudents;
    }

    public void dropStudent(String student)
    {
        int id = findStudent(student);
        if(id == numberOfStudents)
        {
            return;
        }

        -- numberOfStudents;
        swap(id, numberOfStudents);
        students[numberOfStudents] = null;
    }

    private void swap(int i, int j)
    {
        String temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

    private int findStudent(String student)
    {
        for(int i = 0; i < numberOfStudents; ++ i)
        {
            if(students[i].equals(student))
            {
                return i;
            }
        }

        return numberOfStudents;
    }
}
