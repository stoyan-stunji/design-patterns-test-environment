import java.util.List;
import java.util.ArrayList;

public class RegionFilter implements ListingFilterVisitor
{
    Region region;

    private List<Listing> filteredProducts = new ArrayList<>();

    public RegionFilter(Region region)
    {
        this.region = region;
    }

    public boolean visit(Listing listing)
    {
        return this.region.equals(listing.region());
    }
}