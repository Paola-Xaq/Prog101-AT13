package org.fundacionjala.prog101.Gustavo.Practice04.Diamond;

public interface Interface02 extends Interface01 {
    @Override
    default void mesaggeRegards() {
        System.out.println("Hi, I am Interface02");
    }
}
