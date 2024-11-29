public class Wheel extends Product
{
    private String description;

    public Wheel(Double price)
    {
        super(price);
    }

    public String getDescription()
    {
        return this.description;
    }
}
