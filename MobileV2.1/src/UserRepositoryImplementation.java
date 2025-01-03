import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImplementation implements UserRepository
{
    private final Map<String, UserType> storage = new HashMap<>();

    public UserType findById(String id)
    {
        return storage.get(id);
    }

    public void save(UserType user)
    {
        storage.put(user.getId(), user);
    }
}