package org.fundacionjala.prog101.ExercicesJP.wrapperClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Juan", "Gonzales"));
        clientes.add(new Cliente("Maria", "Lopez"));

        Cliente[] clientesArreglo = {new Cliente("Marcia", "Lamas"),
                new Cliente("Pedro", "Gomez")};
        Integer[] enterosArreglo = {1,2,3};

        List<Cliente> clientesLista = WrapperGenerico.fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = WrapperGenerico.fromArrayToList(enterosArreglo);

        WrapperGenerico.imprimir(enterosLista);
        WrapperGenerico.imprimir(clientes);
        WrapperGenerico.imprimir(clientesLista);
    }
}
