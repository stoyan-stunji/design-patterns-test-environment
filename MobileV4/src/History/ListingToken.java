package History;

import Listings.Listing;

public class ListingToken
{
    private final Listing snapshot;

    public ListingToken(Listing listing)
    {
        this.snapshot = listing;
    }

    public ListingToken(ListingToken token)
    {
        this.snapshot = token.snapshot;
    }

    public Listing getListing()
    {
        return this.snapshot;
    }

    public ListingToken getListingSnapshot()
    {
        return this.snapshot.getToken();
    }
}
