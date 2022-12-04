package Shopping;

public class Bill {
    private int sum;

    @Override
    public String toString() {
        return "Bill{" +
                "sum=" + sum +
                '}';
    }

    public Bill() {
    }

    public Bill(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
