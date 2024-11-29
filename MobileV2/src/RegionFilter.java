import java.util.List;
import java.util.ArrayList;

public class RegionFilter implements ProductFilterVisitor
{
    Region region;

    private List<Listing> filteredProducts = new ArrayList<>();

    public RegionFilter(Region region)
    {
        this.region = region;
    }

    public void visit(Listing listing)
    {
        if (this.region.equals(listing.region()))
        {
            filteredProducts.add(listing);
        }
    }

    public List<Listing> getFilteredProducts()
    {
        return filteredProducts;
    }
}