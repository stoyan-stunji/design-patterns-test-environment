import java.util.List;
import java.util.ArrayList;

public class YearFilter implements ProductFilterVisitor
{
    Integer year;

    private List<Listing> filteredProducts = new ArrayList<>();

    public YearFilter(Integer year)
    {
        this.year = year;
    }

    public void visit(Listing listing)
    {
        Product product = listing.product();

        if (product instanceof StreetLegalVehicle)
        {
            StreetLegalVehicle vehicle = (StreetLegalVehicle) product;
            if (vehicle.getYear().equals(this.year))
            {
                filteredProducts.add(listing);
            }
        }
        else if (product instanceof StreetIllegalVehicle)
        {
            StreetIllegalVehicle vehicle = (StreetIllegalVehicle) product;
            if (vehicle.getYear().equals(this.year))
            {
                filteredProducts.add(listing);
            }
        }
        else if (product instanceof Part)
        {
            Part part = (Part) product;
            if (part.getYear().equals(this.year))
            {
                filteredProducts.add(listing);
            }
        }

    }

    public List<Listing> getFilteredProducts()
    {
        return filteredProducts;
    }
}