package animal;

public class BigDog extends Dog
{
    public BigDog() {}

    public BigDog(String name)
    {
        super(name);
    }

    @Override
    public void greets()
    {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog other)
    {
        System.out.println("Woooooow");
    }

    public void greets(BigDog other)
    {
        System.out.println("Wooooooooow");
    }
}
