import java.util.List;
import java.util.ArrayList;

public class PriceFilter implements ListingFilterVisitor
{
    Double min;
    Double max;

    private List<Listing> filteredProducts = new ArrayList<>();

    public PriceFilter(Double min, Double max)
    {
        this.min = min;
        this.max = max;
    }

    public boolean visit(Listing listing)
    {
        if (!listing.isService())
        {
            Double price = listing.product().price;
            return min <= price && price <= max;
        }

        return false;
    }
}
