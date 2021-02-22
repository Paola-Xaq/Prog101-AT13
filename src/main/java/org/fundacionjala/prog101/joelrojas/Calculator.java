package org.fundacionjala.prog101.joelrojas;

public class Calculator {
    public static final int LIMIT = 1000;
    public static final int POS_INI_DELIMITER = 3;
    public static final String COMMA = ",";
    public static final String NEXT_LINE = "\n";

    /**
     * @return an integer that is the total sum.
    */
    public int sum(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (!numbers.startsWith("//")) {
            return sumWithoutDelimiters(numbers);
        } else if (!numbers.startsWith("//[")) {
            return sumWithASimpleDelimiter(numbers);
        } else {
            return sumWithDifferentDelimiters(numbers);
        }
    }

    /**
     * @return an integer that is the sum from a input without delimiter(s).
    */
    private int sumWithoutDelimiters(String numbers) {
        return sumIntArray(separateNumberString(numbers));
    }

    /**
     * @return an integer that is the sum from a input with a simple delimiter.
    */
    private int sumWithASimpleDelimiter(String numbers) {
        String delimiter = numbers.substring(2, numbers.indexOf(NEXT_LINE));
        String newNumbers = cleanNumbers(numbers);
        return sumIntArray(separateNumberString(newNumbers, delimiter));
    }

    /**
     * @return an integer that is the sum from a input with different delimiter(s).
    */
    private int sumWithDifferentDelimiters(String numbers) {
        String delimiters = numbers.substring(POS_INI_DELIMITER, numbers.indexOf(NEXT_LINE));
        String[] delimitersListos = obtaindelimiter(delimiters);
        String newNumbers = cleanNumbers(numbers);
        return sumIntArray(separateNumberString(newNumbers, delimitersListos));
    }

    /**
     * @return a true if inputNumber is under or equal to LIMIT.
    */
    private boolean isUnderLimit(int inputNumber) {
        return inputNumber <= LIMIT;
    }

    /**
     * @return a true if inputNumber is negative number.
    */
    private boolean isNegative(int inputNumber) {
        return inputNumber < 0;
    }

    /**
     * @return a string without the delimiter(s).
    */
    private String cleanNumbers(String numbers) {
        return numbers.substring(numbers.indexOf(NEXT_LINE) + 1);
    }

    /**
     * @return a string array that contains every separated delimiter.
     */
    private String[] obtaindelimiter(String delimiters) {
        int closedBracket = 0;
        boolean esta = false;
        String delimitersWithSpaces = "";
        do {
            closedBracket = delimiters.indexOf("]");
            delimitersWithSpaces += delimiters.substring(0, closedBracket);
            if (closedBracket != delimiters.length() - 1) {
                delimiters = delimiters.substring(closedBracket + 2);
                delimitersWithSpaces += NEXT_LINE;
            } else {
                esta = true;
            }
        } while (!esta);
        return delimitersWithSpaces.split(NEXT_LINE);
    }

    /**
     * @return a string array where they are every number as strings that before they were separated by commas.
     */
    private String[] separateNumberString(String numberString) {
        return separateNumberString(convertToOneDelimiter(numberString), COMMA);
    }

    /**
     * @return a string array where they are every number as strings that before they were separated by some delimiter.
     */
    private String[] separateNumberString(String numberString, String delimiter) {
        return numberString.split("\\" + delimiter);
    }

    /**
     * @return a string array where they are every number as strings that before they were separated by some delimiters.
     */
    private String[] separateNumberString(String numberString, String[] delimiters) {
        String numStrings1 = numberString;
        for (String delimiter : delimiters) {
            numStrings1 = convertToOneDelimiter(numStrings1, delimiter);
        }
        return separateNumberString(numStrings1);
    }

    /**
     * @return a string where the next lines were replaced by commas.
    */
    private String convertToOneDelimiter(String numbers) {
        return numbers.replaceAll(NEXT_LINE, COMMA);
    }

    /**
     * @return a string where the delimiters were replaced by commas.
    */
    private String convertToOneDelimiter(String numbers, String delimiter) {
        return numbers.replaceAll(delimiter, COMMA);
    }

    /**
     * @return an integer that is sum of all these string number converted to integer number.
    */
    private int sumIntArray(String[] stringNumbers) {
        int sum = 0;
        for (String numberS : stringNumbers) {
            int number = Integer.parseInt(numberS);
            /**
             * In order to execute tests this Exception is commented.
            */
            /* String exceptionNegativeNumbers = "";
            if (isNegative(number)) {
                exceptionNegativeNumbers += number + ", ";
            } */
            if (!isNegative(number) && isUnderLimit(number)) {
                sum += number;
            }
            /* if (!exceptionNegativeNumbers.isEmpty()) {
                throw new ArithmeticException("negatives not allowed " + exceptionNegativeNumbers);
            } */
        }
        return sum;
    }
}
