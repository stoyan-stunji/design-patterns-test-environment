import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListingServiceImplementation implements ListingService
{
    private final List<Listing> listings = new ArrayList<>();
    private final UserService userService;

    public ListingServiceImplementation(UserService userService)
    {
        this.userService = userService;
    }

    public List<Listing> searchByFilter(ListingFilterVisitor visitor)
    {
        return listings.stream()
                .filter(visitor::visit)
                .collect(Collectors.toList());
    }

    public void addListing(Listing listing, String userId)
    {
        UserType user = userService.getUserById(userId);

        if (user instanceof Guest)
        {
            throw new UnsupportedOperationException("Guest users cannot add listings.");
        }

        listings.add(listing);
    }

    public void deleteListing(String listingId, String userId)
    {
        UserType user = userService.getUserById(userId);

        if (user instanceof Guest)
        {
            throw new UnsupportedOperationException("Guest users cannot delete listings.");
        }

        listings.removeIf(listing -> listing.getId().equals(listingId));
    }
}
