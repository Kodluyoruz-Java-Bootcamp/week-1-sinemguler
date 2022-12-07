package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "Cem", 26);
        Customer customer1 = new Customer(2, "ayse", 20);
        Customer customer2 = new Customer(3, "deniz", 28);
        Customer cst = new Customer();

        cst.addCustomer(customer); //customer classının içindeki metoda eklendi
        cst.addCustomer(customer1);
        cst.addCustomer(customer2);

        List<Product> productList = new ArrayList<>();
        Product product = new Product("tablet", "teknoloji", 1500, 2);
        productList.add(product);

        Product product1 = new Product("kitap", "eğitim", 1700, 5);
        productList.add(product1);

        Product product2 = new Product("bilgisayar", "teknoloji", 100, 1);
        productList.add(product2);

        Bill bill = new Bill();

        Order order = new Order(customer, productList, bill.getBillSum(productList));
        Order order1 = new Order(customer1, productList, bill.getBillSum(productList));
        Order order2 = new Order(customer2, productList, bill.getBillSum(productList));

        Order ordr = new Order();
        ordr.add(order);
        ordr.add(order1); //aysenin aldığı ürün
        ordr.add(order2);
        ordr.getProductsWithName("Cem");
        ordr.getBill("Cem", 25, 30);

        ordr.getAllBill();
        cst.getAll();

    }
}