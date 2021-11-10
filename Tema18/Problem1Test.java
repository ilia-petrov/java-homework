import java.util.Date;

public class Problem1Test
{
    public static void main(String[] args)
    {
        Person person = new Person("John", "12, \"Iskar\" Str.", "088888888", "john@abv.bg");
        Student student = new Student("John", "12, \"Iskar\" Str.", "088888888", "john@abv.bg", 11);
        Employee employee = new Employee("John", "12, \"Iskar\" Str.", "088888888", "john@abv.bg", 403, 1234.5, new Date());
        Faculty faculty = new Faculty("John", "12, \"Iskar\" Str.", "088888888", "john@abv.bg", 403, 1234.5, new Date(), 123, "PHD");
        Staff staff = new Staff("John", "12, \"Iskar\" Str.", "088888888", "john@abv.bg", 403, 1234.5, new Date(), "Janitor");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
