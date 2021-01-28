package ads.Controller;

import java.util.ArrayList;
import java.util.Scanner;

import ads.model.Product;
import ads.model.Stock;

public class StockController {

    private ArrayList<Product> products;
    Scanner scann = new Scanner(System.in);

    public StockController(ArrayList<Product> products) {
        this.products = products;
    }

    public void removeStock(int idProduct, int quantity) {
        int acumQuantity = 0;
        boolean controlExists = false;

        for (Product product : products) {
            if (product.getId() == idProduct) {
                controlExists = true;

                for (Stock stock : product.getStock()) {
                    acumQuantity += stock.getQuantity();
                    System.out.println("Entrada: " + stock.getQuantity());
                }

            }
            if (acumQuantity > 0 && controlExists) {
                if (acumQuantity < quantity) {
                    if (insuficientStock(acumQuantity).equalsIgnoreCase("si")) {
                        product.getStock().clear();
                    }
                } else {
                    for (Stock stock : product.getStock()) {
                        if (stock.getQuantity() <= quantity) {
                            quantity -= stock.getQuantity();
                            product.getStock().poll();
                            System.out.println(quantity);
                        } else {
                            if (quantity != 0) {
                                stock.setQuantity(stock.getQuantity() - quantity);
                                quantity = 0;
                            }
                        }
                    }
                }

            } else {
                System.out.println("Producto no disponible");
            }
        }
        System.out.println(acumQuantity + " - " + controlExists + "Ant");

    }

    private String insuficientStock(int acumQuantity) {
        System.out.println("Cantidad insuficiente, desea retirar el total de " + acumQuantity + " para este producto?");
        System.out.println("si/no");
        String text = scann.nextLine();
        if (text.equalsIgnoreCase("si") || text.equalsIgnoreCase("no")) {

            return text;
        } else {

            return insuficientStock(acumQuantity);
        }
    }
}
