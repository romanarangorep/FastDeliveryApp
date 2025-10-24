package Model;

import java.time.LocalDate;

import Model.Exception.ExpiredProductException;
import Model.Exception.InvalidProductDataException;

public class FoodProduct extends Product {
    private LocalDate expirationDate;
    private LocalDate todayDate;

    public FoodProduct( String name, double basePrice, int cuantity, LocalDate expirationDate )throws InvalidProductDataException, ExpiredProductException{
        super(name, basePrice, cuantity);
        this.todayDate = LocalDate.now();
        if(todayDate.isAfter(expirationDate))
         throw new ExpiredProductException("Su producto esta expirado");    

        this.expirationDate = expirationDate;
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice;
        totalPrice = (basePrice*cuantity*0.9);
        return totalPrice;
    }



}
