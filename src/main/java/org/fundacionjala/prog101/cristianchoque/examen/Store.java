package org.fundacionjala.prog101.cristianchoque.examen;

public class Store {

    private String[][] invoiceProducts = new String[10][2];

    /**
     *
     */
    public void buy(final String name, final String price) {
        invoiceProducts[0][0] = name;
        invoiceProducts[0][1] = price;
    }

    public void showInvoice() {
        for (int i = 0; i < invoiceProducts.length; i++) {
            for (int j = 0; j < invoiceProducts[0].length; j++) {
                System.out.print(invoiceProducts[i][j] + "\t\t");
            }
            System.out.println("");
        }
    }

    public void createInvoice() {

    }

    /**
     *
     * @return
     */
    public int getTotalCost() {
        return 0;
    }
}
