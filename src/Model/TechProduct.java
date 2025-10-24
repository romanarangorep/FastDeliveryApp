package Model;

import Model.Exception.InvalidProductDataException;
import Model.Exception.InvalidWarrantyException;

public class TechProduct extends Product{
    private int warrantyMonths;

    public TechProduct(String name, double basePrice, int cuantity, int warrantyMonths)throws InvalidProductDataException, InvalidWarrantyException{
        super(name, basePrice, cuantity);
        if(warrantyMonths<0)
            throw new InvalidWarrantyException("Garantia invalida");
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateTotalPrice() {
      
        double warrantyRatePerMonth = 0.05 / 12.0;
        double warrantySurchargePerUnit = basePrice * warrantyRatePerMonth * warrantyMonths;
        double totalPrice = (basePrice + warrantySurchargePerUnit) * cuantity;
        return totalPrice;
    }

}
