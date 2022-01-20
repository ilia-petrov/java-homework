package animal;

public class Dog extends Animal
{
    public Dog() {}

    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void greets()
    {
        System.out.println("Woof");
    }

    public void greets(Dog other)
    {
        System.out.println("Woooof");
    }
}
