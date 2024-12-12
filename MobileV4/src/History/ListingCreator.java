package History;

import Listings.Listing;

public class ListingCreator
{
    private ListingToken currentToken;

    public ListingCreator(ListingToken listing)
    {
        this.currentToken = listing;
    }

    public void setListing(ListingToken listing)
    {
        this.currentToken = listing;
    }

    public Listing getListing()
    {
        return this.currentToken.getListing();
    }

    public ListingToken saveToToken()
    {
        return new ListingToken(currentToken.getListingSnapshot());
    }

    public void restoreFromToken(ListingToken token) {
        this.currentToken = token.getListingSnapshot();
    }
}
