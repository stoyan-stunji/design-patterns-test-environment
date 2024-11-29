import java.util.List;
import java.util.ArrayList;

public class YearFilter implements ListingFilterVisitor
{
    Integer year;

    private List<Listing> filteredProducts = new ArrayList<>();

    public YearFilter(Integer year)
    {
        this.year = year;
    }

    public boolean visit(Listing listing)
    {
        if(!listing.isService())
        {
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
        }

        return false;
    }
}