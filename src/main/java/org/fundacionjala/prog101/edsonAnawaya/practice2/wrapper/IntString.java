package org.fundacionjala.prog101.edsonAnawaya.practice2.wrapper;

public class IntString {
    protected int value;

    public IntString(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String oneNumberString(int index) {
        String intString = value + "";
        if(index >=intString.length()){
            return "invalid index";
        }
        for (int i = 0; i < intString.length(); i++) {
            if (i == index) {
                return changeNumberToString(intString.charAt(i));
            }
        }
        return "";
    }

    public String allNumberString() {
        String intString = value + "";
        String newString ="";
        for (int i = 0; i < intString.length(); i++) {
            newString+=changeNumberToString(intString.charAt(i));
            if(i != intString.length()-1){
                newString+=", ";
            }
        }
        return newString;
    }

    public String changeNumberToString(char number) {
        switch (number) {
            case '0':
                return "zero";
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
            default:
                return "";
        }
    }

}
