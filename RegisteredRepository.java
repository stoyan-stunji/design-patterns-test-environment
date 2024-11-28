public interface RegisteredRepository<T>
{
    void save(Registered registered);
    Registered findById(String id);    

    void makeListing();
    void deleteListing();
    Listing findByFilter(Filter<T> filter);
}

