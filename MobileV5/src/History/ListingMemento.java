package History;

import Listings.Listing;

public class ListingMemento
{
    private final Listing listingSnapshot;

    public ListingMemento(Listing listing)
    {
        this.listingSnapshot = listing;
    }

    public Listing getListingSnapshot()
    {
        return this.listingSnapshot;
    }
}
