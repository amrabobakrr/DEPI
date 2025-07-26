package AssForPractice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new ElectronicProduct("1582", "iphone", 7500.0, 10, "Electronics", 24));
        products.add(new BookProduct("8202", "Java ", 80.0, 40, "Books", "Helaal"));

        for (Product p : products) {
            System.out.println("----- Product Info -----");
            System.out.println(p);
            System.out.println();
        }
    }
}

