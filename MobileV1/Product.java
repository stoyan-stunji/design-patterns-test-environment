public record Product
(
    Double price,
    String description,
    Integer yearOfProduction
) 
{
    public Product(Double price, String description, Integer yearOfProduction) 
    {
        this.price = price;
        this.description = description;
        this.yearOfProduction = yearOfProduction;
    }

    public Double getPrice() 
    {
        return this.price;
    }

    public String getDescription() 
    {
        return this.description;
    }

    public Integer getYearOfProduction() 
    {
        return this.yearOfProduction;
    }
}
