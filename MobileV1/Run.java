public class Run 
{
    public static void main(String[] args) 
    {
        Product p1 = new Product(200.0, "Test Product", 1978);
 
        Region r1 = new Region("Bulgaria", "Sliven");

        Owner o1 = new Owner("Stoyan", "Stoyanov", "Ivanov", "---", r1);

        Listing l1 = new Listing("7", p1, r1, o1, false, "---", new ExpiryDate(new Date(10, 10, 24), new Date(10, 11, 24)), false);

        System.out.println(l1.toString());
    }
}
