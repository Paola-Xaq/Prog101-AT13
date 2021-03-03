package org.fundacionjala.prog101.ExercicesJP.wrapperClass;

import java.util.Arrays;
import java.util.List;

public class WrapperGenerico {

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T> void imprimir(List<T> c) {
        for (T t : c) {
            System.out.println(t);
        }
    }

}
