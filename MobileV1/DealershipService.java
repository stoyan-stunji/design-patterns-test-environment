public class DealershipService<T>
{
    private final DealershipRepository<T> repository;

    public DealershipService(DealershipRepository<T> repository)
    {
        this.repository = repository;
    }

    public void addDealership(Dealership dealership) 
    {
        repository.save(dealership);
    }

    public Dealership findDealershipById(String id) 
    {
        return repository.findById(id);
    }

    public void makeListing()
    {

    }

    public void deleteListing()
    {

    }

    public Listing findByFilter(Filter<T> filter)
    {
        return new Listing(null, null, null, null, null, null, null, null);
    }
}
