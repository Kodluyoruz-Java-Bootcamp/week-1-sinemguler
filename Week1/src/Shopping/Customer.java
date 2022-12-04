package Shopping;

public class Customer {
    private String name;
    private int yas;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", yas=" + yas +
                '}';
    }

    public Customer() {
    }

    public Customer(String name, int yas) {
        this.name = name;
        this.yas = yas;
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
}
