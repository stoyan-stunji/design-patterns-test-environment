package Products.StreetLegalVehicles.Vehicles;

import Products.StreetLegalVehicles.*;
import Products.Enums.*;

public class Truck extends StreetLegalVehicle
{
    // TO::DO Add specialized members;

    public Truck(double price, Brand brand, Model model, int year, Engine engine, Gearbox gearbox) {
        super(price, brand, model, year, engine, gearbox);
    }
}