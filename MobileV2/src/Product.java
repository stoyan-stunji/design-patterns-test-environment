public class Product
{
    protected Double price;

    public Product()
    {
        price = -1.0;
    }

    public Product(Double price)
    {
        this.price = price;
    }

    public Double getPrice()
    {
        return this.price;
    }
}
