package bai12_collection_framework.exercise.product_management;


import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.ArrayList;

public class ProductManager {
        ArrayList<Product> product = new ArrayList<Product>();


        static {
                Product product1 = new Product(1, "iphone", 25000);
                Product product2 = new Product(2, "samsung", 20000);
                Product product3 = new Product(3, "sony", 15000);
        }

        
}
