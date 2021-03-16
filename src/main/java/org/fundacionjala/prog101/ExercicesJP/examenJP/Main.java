package org.fundacionjala.prog101.ExercicesJP.examenJP;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(132,"Juan Pablo",TypeEmployee.MANAGER);
        Product producto1 = new Product("bread",1,"u");
        Product producto2 = new Product("milk",10,"lt");
        Product producto3 = new Product("oil",10,"lt");
        Product producto4 = new Product("rice",5,"kg");


        ItemInvoice[] items = {
                new ItemInvoice(10,producto1),
                new ItemInvoice(5,producto2),
                new ItemInvoice(10,producto3),
                new ItemInvoice(20,producto4)
        };

        Store store = new Store();
        store.setItems(items);
        store.setEmployee(employee);
        System.out.println(store.getEmployee());
        System.out.println(store.showDetail());

    }
}
