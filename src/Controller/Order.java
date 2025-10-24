package Controller;

import Model.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Controller for the gestion about Order
 * contains (Create, showOrder,CalculateTotalOrder)
 * for the products
 * 
 * @author Roman Andres Arango Rodriguez
 * @version 1.0
 */

public class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public void showOrderDetails(){
        for (Product pr : products) {
            System.out.println("\nproducto"+pr.showInfo()+"\nPrecio total: "+pr.calculateTotalPrice());            
        }
    }

    public double calculateTotalOrderValue(){
        double total=0;
        for (Product p : products) {
            total+=p.calculateTotalPrice();            
        }
        return total;
    }

}
