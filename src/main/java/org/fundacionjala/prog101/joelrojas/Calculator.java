package org.fundacionjala.prog101.joelrojas;

public class Calculator {
    public static final int LIMIT = 1000;
    public static final int POS_INI_DELIMITER = 3;
    public static final String COMMA = ",";
    public static final String NEXT_LINE = "\n";

    /** */
    public int sum(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (!numbers.startsWith("//")) {
            return sumWoD(numbers);
        } else if (!numbers.startsWith("//[")) {
            return sumWASD(numbers);
        } else {
            return sumWDD(numbers);
        }
    }

    /** */
    public int sumWoD(String numbers) {
        return sumIntArray(separateNumberString(numbers));
    }

    /** */
    public int sumWASD(String numbers) {
        String delimiter = numbers.substring(2, numbers.indexOf("\n"));
        String newNumbers = cleanNumbers(numbers);
        return sumIntArray(separateNumberString(newNumbers, delimiter));
    }

    /** */
    public int sumWDD(String numbers) {
        String delimiters = numbers.substring(POS_INI_DELIMITER, numbers.indexOf("\n"));
        String[] delimitersListos = obtaindelimiter(delimiters);
        String newNumbers = cleanNumbers(numbers);
        return sumIntArray(separateNumberString(newNumbers, delimitersListos));
    }

    /**
     * @return a true if inputNumber is under or equal to LIMIT.
    */
    public boolean isUnderLimit(int inputNumber) {
        return inputNumber <= LIMIT;
    }

    /**
     * @return a true if inputNumber is negative number.
    */
    public boolean isNegative(int inputNumber) {
        return inputNumber < 0;
    }

    /** */
    public String cleanNumbers(String numbers) {
        return numbers.substring(numbers.indexOf("\n") + 1);
    }
    /**
     *
     */
    public String[] obtaindelimiter(String delimiters) {
        int closedBracket = 0;
        boolean esta = false;
        String delimitersWithSpaces = "";
        do {
            closedBracket = delimiters.indexOf("]");
            delimitersWithSpaces += delimiters.substring(0, closedBracket);
            if (closedBracket != delimiters.length() - 1) {
                delimiters = delimiters.substring(closedBracket + 2);
                delimitersWithSpaces += "\n";
            } else {
                esta = true;
            }
        } while (!esta);
        return delimitersWithSpaces.split("\n");
    }
    /**
     *
     */
    public String[] separateNumberString(String numberString) {
        return separateNumberString(convertToOneDelimiter(numberString), COMMA);
    }
    /**
     *
     */
    public String[] separateNumberString(String numberString, String delimiter) {
        return numberString.split("\\" + delimiter);
    }
    /**
     *
     */
    public String[] separateNumberString(String numberString, String[] delimiters) {
        String numStrings1 = numberString;
        for (String delimiter : delimiters) {
            numStrings1 = convertToOneDelimiter(numStrings1, delimiter);
        }
        return separateNumberString(numStrings1);
    }

    /** */
    public String convertToOneDelimiter(String numbers) {
        return numbers.replaceAll(NEXT_LINE, COMMA);
    }
    /** */
    public String convertToOneDelimiter(String numbers, String delimiter) {
        return numbers.replaceAll(delimiter, COMMA);
    }

    /**
     * sum every number inside the array.
    */
    public int sumIntArray(String[] stringNumbers) {
        int sum = 0;
        for (String numberS : stringNumbers) {
            System.out.println(numberS);
            int number = Integer.parseInt(numberS);
            if (!isNegative(number) && isUnderLimit(number)) {
                sum += number;
            }
        }
        return sum;
    }
}
