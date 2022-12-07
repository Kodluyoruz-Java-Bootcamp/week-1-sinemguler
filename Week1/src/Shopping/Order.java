package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Order> orderList = new ArrayList<>();
    private Customer customer;
    private List<Product> productList = new ArrayList<>();
    private int bill;

    public Order() {
    }

    public Order(Customer customer, List<Product> productList, int bill) {

        this.customer = customer;
        this.productList = productList;
        this.bill = bill;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void add(Order order) {
        orderList.add(order);
    }

    public void getProductsWithName(String name) { //ismi cem olan müşterinin aldığı ürün sayısı
        for (Order order : orderList) {
            if (order.getCustomer().getName().equalsIgnoreCase(name)) {
                System.out.println(order.productList.size() + " adet ürün alındı");
            }

        }
    }

    public void getBill(String name, int age1, int age2) { //ismi cem yaşı 25 den büyük 30 dan küçük olan
        for (Order order : orderList) {
            if (order.getCustomer().getName().equalsIgnoreCase(name)) {
                if (order.getCustomer().getYas() > 25 || order.getCustomer().getYas() < 30) {
                    System.out.println(order.getBill() + " toplam alışveriş tutarı");
                }
            }
        }
    }

    public void getAllBill() {
        for (Order order : orderList) {
            if (order.getBill() > 1500) {
                System.out.println(order.getBill() + " faturalar listesi");
            }

        }
    }
}
