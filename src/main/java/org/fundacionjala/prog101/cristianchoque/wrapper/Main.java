package org.fundacionjala.prog101.cristianchoque.wrapper;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public Main() { }

    public static void main(final String[] args) {

        List list = new ArrayList();

        for (int i = 0; i < 2; i++) {
            list.add(new IntVal(i));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            ((IntVal) list.get(i)).increment();
        }

        System.out.println(list);

    }

}
