package bai17_binary_and_serialization.exercise.product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();

    public static void writeFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Product> readFile() {
        List<Product> product = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src\\bai17_binary_and_serialization\\exercise\\product_management\\product.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            product = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return product;
    }

    public static void add() {
        System.out.println("Enter Id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Product's name : ");
        String name = scanner.nextLine();

        System.out.println("Enter producer : ");
        String producer = scanner.nextLine();

        System.out.println("Enter price : ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter descriptions: ");
        String descriptions = scanner.nextLine();

        Product product = new Product(id, name, producer, price, descriptions);
        productList = readFile();
        productList.add(product);
    }

    public static void search() {
        System.out.println("Enter Product's name ");
        String names = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (names.equals(productList.get(i).getName())) {
                System.out.println(productList.get(i));
                count++;
            }
        }
    }

    public static void display() {
        productList = readFile();
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(i + 1 + ". " + productList.get(i));
        }
    }
}




