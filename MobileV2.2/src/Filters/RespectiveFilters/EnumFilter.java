package Filters.RespectiveFilters;

import Filters.ListingFilterVisitor;
import Listings.*;
import Products.StreetLegalVehicles.*;
import Products.StreetIllegalVehicles.*;
import Products.Enums.*;

public class EnumFilter implements ListingFilterVisitor {

    private Brand brandToFilter;
    private Model modelToFilter;
    private Engine engineToFilter;
    private Gearbox gearboxToFilter;
    private StreetIllegalVehicleType streetIllegalVehicleType;

    public EnumFilter(Brand brandToFilter)
    {
        this.brandToFilter = brandToFilter;
    }

    public EnumFilter(Model modelToFilter)
    {
        this.modelToFilter = modelToFilter;
    }

    public EnumFilter(Engine engineToFilter)
    {
        this.engineToFilter = engineToFilter;
    }

    public EnumFilter(Gearbox gearboxToFilter)
    {
        this.gearboxToFilter = gearboxToFilter;
    }

    public EnumFilter(StreetIllegalVehicleType streetIllegalVehicleType)
    {
        this.streetIllegalVehicleType = streetIllegalVehicleType;
    }

    public boolean visit(Listing listing)
    {
        if (listing.getProduct() instanceof StreetLegalVehicle vehicle)
        {
            if (brandToFilter != null)
            {
                return vehicle.getBrand() == brandToFilter;
            }
            else if (modelToFilter != null)
            {
                return vehicle.getModel() == modelToFilter;
            }
            else if(engineToFilter != null)
            {
                return vehicle.getEngine() == engineToFilter;
            }
            else if(gearboxToFilter != null)
            {
                return vehicle.getGearbox() == gearboxToFilter;
            }
        }
        else if (listing.getProduct() instanceof StreetIllegalVehicle vehicle)
        {
            if(streetIllegalVehicleType != null)
            {
                return vehicle.getType() == streetIllegalVehicleType;
            }
        }
        return false;
    }
}
