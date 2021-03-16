package org.fundacionjala.prog101.cristianchoque.examen;

//https://app.diagrams.net/#G1PdtEfLXbYZBFDCfOmud5BFzDYhT-oAt2

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        System.out.println("STORE");

        Product producto1 = new Product("Bread", "u", "lactose", "PIL", "1", 10, 10);
        Product producto2 = new Product("Milk", "lt", "masitas", "San Gabriel", "10", 5, 10);
        Product producto3 = new Product("OOil", "lt", "grasas", "Fino", "10", 10, 10);
        Product producto4 = new Product("Rice", "kg", "cereal", "Ingenio", "5", 20, 10);
        Store almacen = new Store();
        almacen.buy(10, producto1);
        almacen.buy(5, producto2);
//        almacen.buy(10, producto3);
//        almacen.buy(22, producto4);

        System.out.println("Cantidad" + "\t\t" + "Product" + "\t\t" + "Price" + "\t" + "Total" + "\t" + "WithPromo");
        System.out.println("-------------------------------------------------------");
        almacen.createInvoice().showInvoice();
        System.out.println("-------------------------------------------------------");
        System.out.println("Total Cost:" + "\t\t\t\t\t\t\t\t\t$ " + almacen.createInvoice().getTotalCost());
    }
}
