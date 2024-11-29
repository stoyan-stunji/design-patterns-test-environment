import java.util.HashMap;
import java.util.Map;

public class UserServiceImplementation implements UserService
{
    private final Map<String, UserType> users = new HashMap<>();

    public void addUser(UserType user)
    {
        if (users.containsKey(user.getId()))
        {
            throw new IllegalArgumentException("User with ID " + user.getId() + " already exists.");
        }
        users.put(user.getId(), user);
    }

    public void deleteUser(String id)
    {
        if (!users.containsKey(id))
        {
            throw new IllegalArgumentException("User with ID " + id + " does not exist.");
        }

        users.remove(id);
    }

    public UserType getUserById(String id)
    {
        return users.getOrDefault(id, null);
    }
}
