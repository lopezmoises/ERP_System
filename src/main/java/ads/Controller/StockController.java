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
        int poll = 0;
        boolean controlExists = false;
        ArrayList<String> entradas = new ArrayList<String>();

        for (Product product : products) {
            if (product.getId() == idProduct) {
                controlExists = true;

                for (Stock stock : product.getStock()) {
                    acumQuantity += stock.getQuantity();
                    entradas.add("Entrada: " + stock.getQuantity());
                }

            }
            if (acumQuantity > 0) {
                if (acumQuantity < quantity) {
                    if (insuficientStock(acumQuantity).equalsIgnoreCase("si")) {
                        product.getStock().clear();
                        System.out.println("Entradas eliminadas");
                        for (String ent : entradas) {
                            System.out.println(ent);
                        }
                    }
                } else {
                    for (Stock stock : product.getStock()) {
                        if (stock.getQuantity() <= quantity) {
                            quantity -= stock.getQuantity();
                            poll++;
                            System.out.println(quantity);
                        } else {
                            if (quantity != 0) {
                                stock.setQuantity(stock.getQuantity() - quantity);
                                quantity = 0;
                            }
                        }
                    }
                    for (int i = 0; i < poll; i++) {
                        product.getStock().poll();
                    }
                }
                break;
            }
        }
        if (!controlExists) {
            System.out.println("Producto no disponible");
        } else {
            if (acumQuantity == 0) {
                System.out.println("Sin Stock");
            }
        }
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
