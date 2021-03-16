public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product milk = new Product("milk", 10, "lt",45, 5);
        Product bread = new Product("bread", 1, "u", 9, 10);
        Product rice = new Product("rice",5, "kg", 90, 20);
        Product oil = new Product("oil",10, "lt", 90, 10);

        store.addProduct(milk);
        store.addProduct(bread);
        store.addProduct(rice);
        store.addProduct(oil);
        store.printProducts();

        store.buy(milk, 5);
        store.buy(bread, 5);
        store.buy(oil, 20);
        store.buy(rice, 10);

        store.createInvoice().printInvoice();
    }
}
