package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Customer> customer = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        List<Order> order = new ArrayList<>();
        Customer customer1 = new Customer("Cem", 25);
        Customer customer2 = new Customer("Ali", 28);
        Customer customer3 = new Customer("Cem", 26);
        customer.add(customer1);
        customer.add(customer2);
        customer.add(customer3);


        Product product1 = new Product("Monster Notebook",  "Bilgisayar",  15000, 2);
        Product product2 = new Product("iPad", "Tablet", 9000, 3);
        Product product3 = new Product("Samsung", "Telefon", 10000, 5);
        products.add(product1);
        products.add(product2);
        products.add(product3);

        Order order1 = new Order("iPad 9.Nesil");
        Order order2 = new Order("Monster Abra A5");
        Order order3 = new Order("Samsung Galaxy A53");
        order.add(order1);
        order.add(order2);
        order.add(order3);

        Bill bill1 = new Bill();
        bill1.setSum(1900);
        Bill bill2 = new Bill();
        bill2.setSum(1400);
        Bill bill3 = new Bill();
        bill3.setSum(1600);
        List<Bill> billList = new ArrayList<>();
        billList.add(bill1);
        billList.add(bill2);
        billList.add(bill3);
        for (Bill bill: billList) {
            if (bill.getSum()>1500){
                System.out.println(bill.getSum());
            }

        }
        System.out.println(customer);
        System.out.println(customer.size());
        System.out.println(products);
        System.out.println(order);

    }
}