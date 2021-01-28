package ads.Controller;

import java.util.ArrayList;
import ads.model.Product;

public class ProductController {

    public ArrayList<Product> products;

    public ProductController(ArrayList<Product> products) {
        this.products = products;
    }

    public void getById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("id: " + product.getId());
                System.out.println("Nombre: " + product.getName());
                System.out.println("Precio: " + product.getPrices_currency() + " " + product.getPrices_amountMax());
                System.out.println(product.printStock() + "\n");
                break;
            }
        }
    }
    
    public void getByName(String name) {
        for (Product product : products) {
            if (product.getName().contains(name)) {
                System.out.println("id: " + product.getId());
                System.out.println("Nombre: " + product.getName());
                System.out.println("Precio: " + product.getPrices_currency() + " " + product.getPrices_amountMax());
                System.out.println(product.printStock() + "\n");
            }
        }
    }
}
