package Filters.RespectiveFilters;

import Filters.ListingFilterVisitor;
import Listings.*;

public class PriceFilter implements ListingFilterVisitor
{
    private final Double min;
    private final Double max;

    public PriceFilter(Double min, Double max)
    {
        this.min = min;
        this.max = max;
    }

    public boolean visit(Listing listing)
    {
        if (!listing.isService())
        {
            Double price = listing.getProduct().getPrice();
            return min <= price && price <= max;
        }

        return false;
    }
}
