package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private int yas;
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", yas=" + yas +
                '}';
    }

    public Customer() {
    }

    public Customer(int id, String name, int yas) {
        this.id = id;
        this.name = name;
        this.yas = yas;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


    public  void addCustomer(Customer customer){
        customerList.add(customer);
    }
    public void getAll(){
        System.out.println(customerList.size()+ " sayıda müşteri vardır");

    }
}
