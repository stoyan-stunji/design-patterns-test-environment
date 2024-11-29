public class Guest extends UserType
{
    public Guest(String id)
    {
        super(id);
    }

    public Role getRole()
    {
        return Role.Guest;
    }
}
