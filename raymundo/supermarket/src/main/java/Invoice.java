import java.util.ArrayList;

public class Invoice {
    private ArrayList<Product> productList = new ArrayList<>();

    public int getTotalCost() {
        int sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void setProductList(ArrayList<Product> products) {
        for (Product product : products) {
            this.productList.add(product);
        }
    }

    public ArrayList<Integer> getUnitPrice() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Product product : productList) {
            arrayList.add(product.getPrice());
        }
        return arrayList;
    }
}
