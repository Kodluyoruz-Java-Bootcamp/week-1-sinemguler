package Shopping;

public class Order {
    private String orders;

    @Override
    public String toString() {
        return "Order{" +
                "orders='" + orders + '\'' +
                '}';
    }

    public Order() {
    }

    public Order(String orders) {
        this.orders = orders;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }
}
