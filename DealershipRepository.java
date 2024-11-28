public interface DealershipRepository<T>
{
    void save(Dealership dealership);
    Dealership findById(String id);   
    
    void makeListing();
    void deleteListing();
    Listing findByFilter(Filter<T> filter);
}
