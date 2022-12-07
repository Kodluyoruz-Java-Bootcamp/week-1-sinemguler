package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Product> productList = new ArrayList<>();

    public Bill() {
    }

    public Bill(List<Product> productList) {
        this.productList = productList;
    }

    public int getBillSum(List<Product> productList) { //toplam fatura değerini hesaplar
        int sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }
        return sum;
    }
}
