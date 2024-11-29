public interface GuestRepository<T>
{
    Listing findByFilter(Filter<T> filter);
}
