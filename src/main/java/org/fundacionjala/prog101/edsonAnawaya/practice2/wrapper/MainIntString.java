package org.fundacionjala.prog101.edsonAnawaya.practice2.wrapper;

import org.fundacionjala.prog101.edsonAnawaya.practice2.wrapper.IntString;

public class MainIntString {
    public static void main(final String[] args) {
        IntString intString = new IntString(987654);
        System.out.println(intString.oneNumberString(0));
        System.out.println(intString.oneNumberString(3));
        System.out.println(intString.allNumberString());

    }
}