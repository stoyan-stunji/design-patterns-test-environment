import java.util.List;

public interface ListingService
{
    void addListing(Listing listing, String userId);
    void deleteListing(String listingId, String userId);
    List<Listing> searchByFilter(ListingFilterVisitor visitor);
}
