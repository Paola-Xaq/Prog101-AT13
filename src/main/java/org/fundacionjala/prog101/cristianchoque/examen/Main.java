package org.fundacionjala.prog101.cristianchoque.examen;

//https://app.diagrams.net/#G1PdtEfLXbYZBFDCfOmud5BFzDYhT-oAt2

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        System.out.println("STORE");

        Product producto1 = new Product("leche", "lacteo", "PIL", "5");
        Product producto2 = new Product("pan", "masitas", "San Gabriel", "7");
//        Product producto2 = new Product("milk", "lacteo", "PIL", "5");
//        Product producto2 = new Product("milk", "lacteo", "PIL", "5");
        Store almacen = new Store();
        almacen.buy(producto1.getName(), producto1.getPrice());
        almacen.showInvoice();
    }
}
