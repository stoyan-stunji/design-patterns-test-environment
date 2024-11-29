
// Street Illegal Vehicle =def= {Agricultural, Industrial, Curry, Caravan, Yacht, Trailer};

public class StreetIllegalVehicle extends Product
{
    private Type type;
    private Integer year;

    public StreetIllegalVehicle(Double price, Type type, Integer year)
    {
        super(price);
        this.type = type;
        this.year = year;
    }

    public Type getType()
    {
        return this.type;
    }

    public Integer getYear()
    {
        return this.year;
    }
}
