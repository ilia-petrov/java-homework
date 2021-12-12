public class ChildrenBook extends Book
{
    private int age;

    public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age)
    {
        super(regularPrice, publisher, yearPublished);
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public double computeSalePrice()
    {
        return 0.7 * getRegularPrice();
    }
}
