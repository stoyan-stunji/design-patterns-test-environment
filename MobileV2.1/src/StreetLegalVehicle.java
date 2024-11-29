
// Street Legal Vehicle =def= {Car, Truck, Bus, Motorcycle};

public class StreetLegalVehicle extends Product
{
    protected String brand;
    protected String model;
    protected Integer year;
    protected Engine engine;
    protected Gearbox gearbox;

    public StreetLegalVehicle(Double price, String brand, String model,
                              Integer year, Engine engine, Gearbox gearbox)
    {
        super(price);

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.gearbox = gearbox;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public Integer getYear()
    {
        return year;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public Gearbox getGearbox()
    {
        return gearbox;
    }
}

