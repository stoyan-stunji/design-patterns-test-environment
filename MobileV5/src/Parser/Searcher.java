package Parser;

import java.util.List;

public interface Searcher {
    List<Listing> search(List<Listing> listings, String query);
}
