public record Listing
(
    String id,
    Product product,

    Region region,
    Owner owner,

    Boolean isVip,
    String description,

    ExpiryDate expiryDate,
    Boolean isService
)
{   //TO:DO if is Service, do not need Expiry Date;
    public Listing(String id, Product product, Region region, Owner owner, 
                   Boolean isVip, String description, ExpiryDate expiryDate,
                   Boolean isService) 
    {
        this.id = id;
        this.product = product;

        this.region = region;
        this.owner = owner;

        this.isVip = false;
        this.description = description;

        this.isService = isService;
        this.expiryDate = expiryDate;

        if(isService)
        {
            this.expiryDate.forever();
        }
    }

    public Product getProduct() 
    {
        if (isService) 
        {
            throw new IllegalStateException("Services do not have a product");
        }
        return this.product;
    }

    public Region getRegion() 
    {
        return this.region;
    }

    public Owner getOwner()
    {
        return this.owner;
    }

    public String getId()
    {
        return this.id;
    }

    public Boolean isItVip()
    {
        return this.isVip;
    }

    public String getDescription() 
    {
        return this.description;
    }

    public ExpiryDate getExpiryDate() 
    {
        return this.expiryDate;
    }

    public void makeAllTime() 
    {
        this.expiryDate.forever();
    }
}
