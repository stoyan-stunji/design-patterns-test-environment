public class GuestService<T> 
{
    private final GuestRepository<T> repository;

    public GuestService(GuestRepository<T> repository)
    {
        this.repository = repository;
    }

    public Listing findByFilter(Filter<T> filter)
    {
        return new Listing(null, null, null, null, null, null, null, null);
    }
}
