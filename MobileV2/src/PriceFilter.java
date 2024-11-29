import java.util.List;
import java.util.ArrayList;

public class PriceFilter implements ProductFilterVisitor
{
    Double min;
    Double max;

    private List<Listing> filteredProducts = new ArrayList<>();

    public PriceFilter(Double min, Double max)
    {
        this.min = min;
        this.max = max;
    }

    public void visit(Listing listing)
    {
        Double price = listing.product().price;
        if (min <= price && price <= max)
        {
            filteredProducts.add(listing);
        }
    }

    public List<Listing> getFilteredProducts()
    {
        return filteredProducts;
    }
}
