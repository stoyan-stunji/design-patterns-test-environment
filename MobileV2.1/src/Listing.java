public record Listing
        (
                String id,

                Product product,
                Region region,

                Owner owner,
                String expiryDate,

                Boolean isVip,
                String description,

                Boolean isService
        )
{
    public Listing(String id, Product product, Region region, Owner owner, String expiryDate,
                   Boolean isVip, String description)
    {
        this(id, product, region, owner, expiryDate, isVip, description, false);
    }

    public Listing(String id, Region region, Owner owner, String expiryDate, Boolean isVip,
                   String description)
    {
        this(id, null, region, owner, expiryDate, isVip, description, true);
    }

    public String getId()
    {
        return this.id;
    }

    public void accept(ListingFilterVisitor visitor)
    {
        visitor.visit(this);
    }
}
