package Filters;

import Listings.*;

public interface ListingFilterVisitor
{
    boolean visit(Listing listing);
}
