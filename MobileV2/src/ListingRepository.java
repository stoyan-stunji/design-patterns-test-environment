import java.util.List;

public interface ListingRepository
{
    void addListing(Listing listing);
    void deleteListing(Listing listing);
    Listing getListing(String id);
}
