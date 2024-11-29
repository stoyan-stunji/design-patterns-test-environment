public record Region
(
    String country,
    String city
) 
{
    public Region(String country, String city)
    {
        this.country = country;
        this.city = city;
    }

    public String getCountry()
    {
        return this.country;
    }

    public String getCity()
    {
        return this.city;
    }
}
