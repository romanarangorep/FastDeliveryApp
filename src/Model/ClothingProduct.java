package Model;

import Model.Exception.InvalidProductDataException;
import Model.Exception.InvalidSizeException;

public class ClothingProduct extends Product{
    private String size;
    
    public ClothingProduct(String name, double basePrice, int cuantity, String size)throws InvalidProductDataException, InvalidSizeException{
        super(name, basePrice, cuantity);
        
        if (size == null || !(size.equalsIgnoreCase("S") || size.equalsIgnoreCase("M") || size.equalsIgnoreCase("L") || size.equalsIgnoreCase("XL"))) {
            throw new InvalidSizeException("Tamaño invalido");
        }
        this.size = size;
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = basePrice * cuantity;
        return totalPrice;
    }

}
