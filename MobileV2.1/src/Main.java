public class Main
{
    public static void main(String[] args)
    {
        Region r1 = new Region("Sofia");
        Region r2 = new Region("Sliven");
        Region r3 = new Region("Plovdiv");

        UserService userService = new UserServiceImplementation();

        try
        {
            userService.addUser(new RegisteredUser("100", "stoyan-stunji", "---@email.com", "123", r1));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            userService.addUser(new RegisteredUser("200", "jessica-dance", "---@email.com", "321", r2));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            userService.addUser(new Dealership("300", "tulsa-king", "---@email.com", "123", "Tulsa King", "---", r2));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            userService.addUser(new Guest("400"));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        ListingService listingService = new ListingServiceImplementation(userService);

        Product p1 = new Car(100.0, "Honda", "A2", 1999, Engine.Benzin, Gearbox.Manual);
        Product p2 = new Bus(200.0, "VW", "B3", 1998, Engine.Benzin, Gearbox.SemiAutomatic);
        Product p3 = new Truck(600.0,"Man", "C5", 2017, Engine.Diesel, Gearbox.Automatic);
        Product p4 = new Motorcycle(150.0, "Harley Davidson", "HD45", 2005, Engine.Hybrid, Gearbox.Manual);
        Product p5 = new Part(50.0, "---", 2017);

        Owner o1 = new Owner( "Stoyan", "Stoyanov", "Ivanov","---", r1);
        Owner o2 = new Owner( "Jessica", "Sami", "Bidgerano","---", r2);
        Owner o3 = new Owner("Kristiyan", "Rumenov", "Stomimenov","---", r3);

        Listing l1 = new Listing("1a", p1, r1, o1, "10.10.24", false, "Honda Car");
        Listing l2 = new Listing("2b", p2, r2, o2,"11.11.24", false, "---");
        Listing l3 = new Listing("3c", p3, r1, o2,"12.12.24", false, "---");
        Listing l4 = new Listing("4d", p4, r3, o3,"15.12.24", false, "---");
        Listing l5 = new Listing("5e", p5, r3, o3,"16.12.24", false, "---");
        Listing l6 = new Listing("6f", r1, o1, "13.12.25", true, "---");

        try
        {
            listingService.addListing(l1, "100");
            listingService.addListing(l2, "200");
            listingService.deleteListing(l2.getId(), "200");
            listingService.addListing(l4, "300");
            listingService.addListing(l5, "300");
            listingService.addListing(l6, "100");
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            listingService.addListing(l3, "400");
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println(e.getMessage());
        }

        PriceFilter priceFilter = new PriceFilter(100.0, 300.0);
        YearFilter yearFilter = new YearFilter(2017);

        System.out.println(listingService.searchByFilter(priceFilter));
    }
}