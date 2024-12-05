package Filters.RespectiveFilters;

import Filters.ListingFilterVisitor;
import Listings.*;
import Regions.*;

public class RegionFilter implements ListingFilterVisitor
{
    private final Region region;

    public RegionFilter(Region region)
    {
        this.region = region;
    }

    public boolean visit(Listing listing)
    {
        return this.region.equals(listing.region());
    }
}