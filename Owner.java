public record Owner
(
    String firstName,
    String secondName,
    String thirdName,

    String contactInfo,
    Region region
) 
{
    public Owner(String firstName, String secondName, String thirdName, 
                 String contactInfo, Region region) 
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;

        this.contactInfo = contactInfo;
        this.region = region;
    }

    public String getFirstName() 
    {
        return this.firstName;
    }

    public String getSecondName() 
    {
        return this.secondName;
    }

    public String getThirdName() 
    {
        return this.thirdName;
    }

    public String getContactInfo() 
    {
        return this.contactInfo;
    }

    public Region getRegion()
    {
        return this.region;
    }
}
