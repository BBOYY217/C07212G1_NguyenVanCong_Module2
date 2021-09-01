package bai12_collection_framework.exercise.product_management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> product = new ArrayList<Product>();

    static {
        product.add(new Product(1, "apple", 30000));
        product.add(new Product(2, "samsung", 35000));
        product.add(new Product(3, "sony", 20000));
    }

    public static void display() {
        for (int i = 0; i < product.size(); i++) {
            System.out.println(i + 1 + " . " + product.get(i));
        }
    }

    public static void add() {
        System.out.println("ID :");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Name :");
        String name = scanner.nextLine();

        System.out.println("Price :");
        int price = Integer.parseInt(scanner.nextLine());

        product.add(new Product(id, name, price));
    }

    public static void editProduct() {
        System.out.println("ID :");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Name :");
        String name = scanner.nextLine();

        System.out.println("Price :");
        int price = Integer.parseInt(scanner.nextLine());

        product.get(id).setName(name);
        product.get(id).setPrice(price);
    }

    public static void deleteProduct() {
        System.out.println("ID :");
        int id = Integer.parseInt(scanner.nextLine());

        product.remove(id);
    }

    public static void search() {
        String name = scanner.nextLine();
        int index = 0;

        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getName().equals(name)) {
                System.out.println(i + 1 + ". " + product.get(i));
                index ++;
            } else if (i == product.size() - 1 && index == 0) {
                System.out.println("Not found");
            }
        }
    }

    public static void priceIncrease(){
        Collections.sort(product);
        display();
    }

    public static void reducedPrice (){
        product.sort(Collections.reverseOrder());
        display();
    }
}
