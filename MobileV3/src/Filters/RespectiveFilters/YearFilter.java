package Filters.RespectiveFilters;

import Filters.ListingFilterVisitor;
import Listings.*;
import Products.*;
import Products.StreetLegalVehicles.*;
import Products.StreetIllegalVehicles.*;
import Products.Parts.*;

public class YearFilter implements ListingFilterVisitor
{
    private final Integer year;

    public YearFilter(Integer year)
    {
        this.year = year;
    }

    public boolean visit(Listing listing)
    {
        if (listing.isService())
        {
            return false;
        }

        Product product = listing.product();

        if (product instanceof StreetLegalVehicle vehicle)
        {
            return vehicle.getYear().equals(this.year);
        }
        else if (product instanceof StreetIllegalVehicle vehicle)
        {
            return vehicle.getYear().equals(this.year);
        }
        else if (product instanceof Part part)
        {
            return part.getYear().equals(this.year);
        }

        return false;
    }
}