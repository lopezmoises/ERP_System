package ads.Controller;

import java.util.ArrayList;

import ads.dao.Node;
import ads.model.Product;

public class ProductController {

    public ArrayList<Product> products;
    public Node productsNode;

    public ProductController(ArrayList<Product> products, Node productsNode) {
        this.products = products;
        this.productsNode = productsNode;
    }

    public void getById(int id) {
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("id: " + product.getId());
                System.out.println("Nombre: " + product.getName());
                System.out.println("Precio: " + product.getPrices_currency() + " " + product.getPrices_amountMax());
                System.out.println(product.printStock() + "\n");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Id no encontrado");
        }
    }

    public void getByName(String name) {
        boolean found = false;
        for (Product product : products) {
            if (product.getName().contains(name)) {
                System.out.println("id: " + product.getId());
                System.out.println("Nombre: " + product.getName());
                System.out.println("Precio: " + product.getPrices_currency() + " " + product.getPrices_amountMax());
                System.out.println(product.printStock() + "\n");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Nombre no encontrado");
        }
    }

    public void getByIdNode(int id) {

        Product product = productsNode.find(id);
        if (product != null) {
            System.out.println("id: " + product.getId());
            System.out.println("Nombre: " + product.getName());
            System.out.println("Precio: " + product.getPrices_currency() + " " + product.getPrices_amountMax());
            System.out.println(product.printStock() + "\n");
        } else {
            System.out.println("Id no encontrado");
        }
    }

    public void getByIdBinary(int id) {
        Product product = binarySearch(id, products);
        if (product != null) {
            System.out.println("id: " + product.getId());
            System.out.println("Nombre: " + product.getName());
            System.out.println("Precio: " + product.getPrices_currency() + " " + product.getPrices_amountMax());
            System.out.println(product.printStock() + "\n");
        } else {
            System.out.println("Id no encontrado");
        }
    }

    public Product binarySearch(int id, ArrayList<Product> products) {
        int size = products.size();
        int middle = size / 2;

        if (size > 1) {
            if (products.get(middle).getId() == id) {
                return products.get(middle);
            } else if (products.get(middle).getId() > id) {
                ArrayList<Product> halfArray = (ArrayList<Product>) products.subList(0, middle);
                return binarySearch(id, halfArray);
            } else {
                ArrayList<Product> halfArray = (ArrayList<Product>) products.subList(middle, size);
                return binarySearch(id, halfArray);
            }
        } else {
            return null;
        }
    }
}
