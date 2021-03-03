package org.fundacionjala.prog101.jessicka.Wrapper;
import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args) {

        List list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(new IntVal(i));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            ((IntVal) list.get(i)).increment();
        }

        System.out.println(list);

    }
}
