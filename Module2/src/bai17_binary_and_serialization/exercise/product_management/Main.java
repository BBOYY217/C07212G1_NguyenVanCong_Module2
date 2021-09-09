package bai17_binary_and_serialization.exercise.product_management;

import bai17_binary_and_serialization.practice.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Product> products) {
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

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Asus", "Taiwan", 5000));
        products.add(new Product(2, "Apple", " United States of America", 12000));
        products.add(new Product(3, "XiaoMi", "China", 3000));
        products.add(new Product(4, "SamSung", "Korean", 8000));
        writeToFile("src\\bai17_binary_and_serialization\\exercise\\product_management\\product.txt", products);
        List<Product> productsDataFromFile = readDataFromFile("src\\bai17_binary_and_serialization\\exercise\\product_management\\product.txt");
        for (Product product : productsDataFromFile) {
            System.out.println(product);
        }
    }
}

