import com.sun.source.tree.ModifiersTree;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Product p1 = new Car(100.0, "Honda", "A2", 1999, Engine.Benzin, Gearbox.Manual);
        Product p2 = new Bus(200.0, "VW", "B3", 1998, Engine.Benzin, Gearbox.SemiAutomatic);
        Product p3 = new Truck(600.0,"Man", "C5", 2017, Engine.Diesel, Gearbox.Automatic);
        Product p4 = new Motorcycle(150.50, "Harley Davidson", "HD45", 2005, Engine.Hybrid, Gearbox.Manual);

        Product p5 = new Part(50.50, "---", 2017);

        Region r1 = new Region("Sofia");
        Region r2 = new Region("Sliven");
        Region r3 = new Region("Plovdiv");

        Owner o1 = new Owner("Stoyan", "Stoyanov", "Ivanov","---", r1);
        Owner o2 = new Owner("Jessica", "Sami", "Bidgerano","---", r2);
        Owner o3 = new Owner("Kristiyan", "Rumenov", "Stomimenov","---", r3);

        Listing l1 = new Listing("1", p1, r1, o1,"10.10.24", false, "---");
        Listing l2 = new Listing("2", p2, r2, o2,"11.11.24", false, "---");
        Listing l3 = new Listing("3", p3, r1, o2,"12.12.24", false, "---");
        Listing l4 = new Listing("4", p4, r3, o3,"15.12.24", false, "---");
        Listing l5 = new Listing("5", p5, r3, o3,"16.12.24", false, "---");

        List<Listing> listings = new ArrayList<>();
        listings.add(l1);
        listings.add(l2);
        listings.add(l3);
        listings.add(l4);
        listings.add(l5);

        YearFilter priceFilter = new YearFilter(2017);
        for (Listing listing : listings)
        {
            listing.accept(priceFilter);
        }

        System.out.println(priceFilter.getFilteredProducts());
    }
}