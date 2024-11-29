public abstract class UserType
{
    protected String id;

    public UserType(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return this.id;
    }

    public abstract Role getRole();
}
