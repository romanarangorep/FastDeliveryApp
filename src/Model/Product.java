package Model;
import Model.Exception.*;
/**Abstract class to represent a product.
 * Contains a common behavior and the abstract method to calculate the final price.
 *@author Roman Andres Arango Rodriguez
 *@version 1.0
 *Date 24/10/2025 
 */

public abstract class Product {
    protected String name;
    protected double basePrice;
    protected int cuantity;

    public Product(String name, double basePrice, int cuantity)throws InvalidProductDataException{
        if(basePrice < 0 || cuantity < 0)
            throw new InvalidProductDataException("Los valores no pueden ser negativos");
        
        this.name = name;
        this.basePrice = basePrice;
        this.cuantity = cuantity;
    }
    
    /*
    *polimorfic method to calculate the final price
    */
    public abstract double calculateTotalPrice();

    public String showInfo(){
        return "Producto: "
        +"\nnombre: "+name
        +"\nprecio base: "+basePrice
        +"\ncantidad: "+cuantity;
    }

}
