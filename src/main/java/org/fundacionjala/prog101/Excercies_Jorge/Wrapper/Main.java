package org.fundacionjala.prog101.Excercies_Jorge.Wrapper;
import java.util.ArrayList;
import java.util.List;
public final class Main {
    private Main() {
    }
    public static void main(final String[] args) {
        final int maxNumbers = 10;
        //Wrapper
        List list = new ArrayList();

        for (int i = 0; i < maxNumbers; i++) {
            list.add(new IntegerValue(i));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            ((IntegerValue) list.get(i)).increment();
        }

        System.out.println(list);
    }
}
