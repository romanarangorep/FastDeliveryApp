package Model;

import Model.Exception.InvalidProductDataException;
import Model.Exception.InvalidSizeException;

public class ClothingProduct extends Product{
    private String size;
    
    public ClothingProduct(String name, double basePrice, int cuantity, String size)throws InvalidProductDataException, InvalidSizeException{
        super(name, basePrice, cuantity);
        if(!size.equals("S") || !size.equals("M") || !size.equals("L") || !size.equals("XL") || !size.equals("s") || !size.equals("m") || !size.equals("l") || !size.equals("xl")){
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
