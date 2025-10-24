package App;
import java.time.LocalDate;
import java.util.Scanner;

import Controller.Order;
import Model.*;
/**
 * Principal class that implements a FastDelivery system
 * allows the gestion about different types of products,
 * includes operations (create products, show order, calculate total),
 * 
 * @author Roman Andres Arango Rodriguez
 * @version 1.0
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order control = new Order();
        int exit = 0;

        while(exit==0){
            try{
                 System.out.println(""+"============MENU============="
            +"\n1.Agregar producto alimenticio."
            +"\n2.Agregar producto tecnológico."
            +"\n3.Agregar prenda de ropa."
            +"\n4.Mostrar pedido."
            +"\n5.Calcular total."
            +"\n6.Salir.");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                 System.out.println("nombre:");
                 String name1 = sc.nextLine();

                 System.out.println("Precio base: ");
                 double basePrice1 = sc.nextDouble();
                 sc.nextLine();

                 System.out.println("Cantidad: ");
                 int cuantity1 = sc.nextInt();
                 sc.nextLine();

                 System.out.println("¿En cuantos dias se vence su alimento?: ");
                 int expirationNumber = sc.nextInt();
                 sc.nextLine();

                 
                 LocalDate todayDate=LocalDate.now();
                 LocalDate expirationDate=todayDate.plusDays(expirationNumber);
                 control.addProduct(new FoodProduct(name1, basePrice1, cuantity1, expirationDate));               
                    
                    break;
                case 2:
                  System.out.println("nombre:");
                 String name2 = sc.nextLine();

                 System.out.println("Precio base: ");
                 double basePrice2 = sc.nextDouble();
                 sc.nextLine();

                 System.out.println("Cantidad: ");
                 int cuantity2 = sc.nextInt();
                 sc.nextLine();

                 System.out.println("Meses de garantia: ");
                 int warrantyMonths = sc.nextInt();
                 sc.nextLine();

                 control.addProduct(new TechProduct(name2, basePrice2, cuantity2, warrantyMonths));
                    
                    break;
                case 3:
                 System.out.println("nombre:");
                 String name3 = sc.nextLine();

                 System.out.println("Precio base: ");
                 double basePrice3 = sc.nextDouble();
                 sc.nextLine();

                 System.out.println("Cantidad: ");
                 int cuantity3 = sc.nextInt();
                 sc.nextLine();

                 System.out.println("Tamaño de la prenda: (S,M,L,XL)");
                 String size = sc.nextLine();

                 control.addProduct(new ClothingProduct(name3, basePrice3, cuantity3, size));
                    
                    break;
                case 4:
                 control.showOrderDetails();

                    break;
                case 5:
                 control.calculateTotalOrderValue();
                    break;
                case 6:
                    exit += 1;
                    break;
                default:
                 System.out.println("Opcion invalida ingrese de nuevo");
                    break;
            }
            sc.close();
            }catch(Exception e){
                System.out.println("Error");
            }
        }
    }

}
