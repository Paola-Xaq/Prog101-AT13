package org.fundacionjala.prog101.Saul.Calculator;
/*
 * Program: Calculator
 *
 * Author: Saul Caspa
 *
 * Written: February, 2021
 *
 * Course: AT13
 *
 * Prog101 Assignment No. 1
 *
 * Description:
 * This is a simple calculator that receives numbers as string
 * then sums the digits contained in the string.
 */

import java.util.ArrayList;

public class Calculator {
    /**
     * Method to add numbers in a string.
     * @param numbers.
     * @return the sum of the numbers in the string.
     */
    public int add(final String inputString) {
        int sum = 0;
        int[]numbersToOperateWith;
        String[]delimiters;
        String stringOfNumbers;
        if (!inputString.equals("")) {
            if (hasGivenDelimiters(inputString)) {
                delimiters = getDelimiters(inputString);
                stringOfNumbers = getNumbers(inputString);
                numbersToOperateWith = splitWithGivenDelimiters(stringOfNumbers, delimiters);
            } else {
                numbersToOperateWith = split(inputString);
            }
            //System.out.println(numbersArray.length);
            for (int number : numbersToOperateWith) {
                sum += number;
            }
            return sum;
        }
        return sum;
    }

    /**
     * Method to split a String into an array of int.
     * @param numbers.
     * @return the array of int.
     */
    public int[] split(final String numbers) {
        String[]stringRes = numbers.split("\n|,");
        int[]intRes = new int[stringRes.length];
        for (int pos = 0; pos < intRes.length; pos++) {
            if (!stringRes[pos].equals("")) {
                intRes[pos] = Integer.parseInt(stringRes[pos]);
            }
        }
        return intRes;
    }

    /**
     * Method to split a string by the retrieved delimiters.
     * @param numbers.
     * @return an array of numbers.
     */
    public int[]splitWithGivenDelimiters(final String numbers, final String[] delimiters) {
        ArrayList<Integer> numbersRetrieved = new ArrayList<Integer>();
        String delimitersToSplitby = "";
        String number = "";
        for (int sPos = 0; sPos < numbers.length(); sPos++) {
            String chartAtPos = String.valueOf(numbers.charAt(sPos));
            for (int dPos = 0; dPos < delimiters.length; dPos++) {
                if (chartAtPos.equals(delimiters[dPos])) {
                    numbersRetrieved.add(Integer.parseInt(number));
                } else {
                    number += chartAtPos;
                }
            }
        }
        String[]stringRes = numbers.split(delimitersToSplitby);
        int[]intRes = new int[stringRes.length];
        for (int pos = 0; pos < intRes.length; pos++) {
            intRes[pos] = Integer.parseInt(stringRes[pos]);
        }
        return intRes;
    }
    /**
     * Method to get the delimiter in the string if has one.
     * @return the delimiter char.
     */
    public String[] getDelimiters(final String numbers) {
        String[]stringSplit = numbers.split("\n");
        String delimiterString = stringSplit[0];
        delimiterString = delimiterString.replaceAll("/", "");
        ArrayList<String> delimitersSection = new ArrayList<String>();
        String delimiter = "";
        for (int pos = 0; pos < delimiterString.length(); pos++) {
            char charAtPos = delimiterString.charAt(pos);
            if (charAtPos == ']') {
                if (!delimiter.equals("")) {
                    delimitersSection.add(delimiter);
                    delimiter = "";
                }
            }
            if (charAtPos != '[' && charAtPos != ']') {
                delimiter += String.valueOf(charAtPos);
            }
        }
        String[] res = delimitersSection.toArray(new String[delimitersSection.size()]);
        return res;
    }

    /**
     * Method to get the numbers section of an string with delimiters.
     * @param numbers.
     * @return numbers fto operate with rom an string.
     */
    public String getNumbers(final String numbers) {
        String[]stringSplit = numbers.split("\n");
        return stringSplit[1];
    }
    /**
     * Method to check if a given string has delimiters.
     * @param numbers.
     * @return boolean.
     */
    public boolean hasGivenDelimiters(final String numbers) {
            return getDelimiters(numbers).length != 0;
    }
}
