public record Listing
        (
                String id,

                Product product,
                Region region,

                Owner owner,
                String expiryDate,

                Boolean isVip,
                String description
        )
{

    public void accept(ProductFilterVisitor visitor)
    {
        visitor.visit(this);
    }
}
