public class RegisteredService<T>
{
    private final RegisteredRepository<T> repository;

    public RegisteredService(RegisteredRepository<T> repository)
    {
        this.repository = repository;
    }

    public void addRegistered(Registered registered) 
    {
        repository.save(registered);
    }

    public Registered findTeacherById(String id) 
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
