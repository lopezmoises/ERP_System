package ads;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import ads.Controller.ProductController;
import ads.Controller.StockController;
import ads.dao.Dao;

/**
 * ERP_System
 */
public final class App {

    static Scanner scanner = new Scanner(System.in);
    static Dao dao;

    public static void main(String[] args) {

        dao = new Dao();
        Menu();
    }

    public static void Menu() {

        ProductController productController = new ProductController(dao.products);
        StockController stockController = new StockController(dao.products);
        int opcion = -1;

        System.out.println("------ MENU -------");
        System.out.println("Elija una opcion:");
        System.out.println("1- Buscar producto por código");
        System.out.println("2- Buscar producto por nombre");
        System.out.println("3- Retirar productos por código");
        System.out.println("0- Salir\n");

        opcion = scannerInt(null);

        switch (opcion) {
            case 0:
                break;
            case 1:
                productController.getById(scannerInt("A continuacion ingrese el código"));
                Menu();
                break;
            case 2:
                productController.getByName(scannerString());
                Menu();
                break;
            case 3:
                int idProduct = scannerInt("A continuacion ingrese el código");
                int quantity = scannerInt("A continuacion ingrese la cantidad");
                stockController.removeStock(idProduct, quantity);
                Menu();
                break;
            default:
                Menu();
                break;
        }

    }

    static int scannerInt(String msj) {
        int entero = 0;
        if (msj != null) System.out.println(msj);
        try {
            entero = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Porfavor Ingrese un número");
            scanner.nextLine();
            scannerInt(msj);
        } catch (NoSuchElementException e) {
            System.err.println("Porfavor Ingrese un número");
            scanner.nextLine();
            scannerInt(msj);
        }
        return entero;
    }

    static String scannerString() {
        String string = scanner.nextLine();
        if (string.length() < 3) {
            System.err.println("Porfavor ingrese un minimo de 3 caracteres");
            return scannerString();
        } else {
            return string;
        }
    }
}
