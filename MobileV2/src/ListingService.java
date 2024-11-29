import java.util.List;

public class ListingService
{
    private final ListingRepository repository;

    public ListingService(ListingRepository repository)
    {
        this.repository = repository;
    }

    public void addListing(Listing listing)
    {
        repository.addListing(listing);
    }

    public void deleteListing(Listing listing)
    {
        repository.deleteListing(listing);
    }

    public Listing getListing(String id)
    {
        return repository.getListing(id);
    }
}