package org.fundacionjala.prog101.joelrojas;

public class Calculator {
    public static final int LIMIT = 1000;
    public static final String COMMA = ",";
    public static final String NEXT_LINE = "\n";
    /** */
    public int sum(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (startsWithNumber(numbers)) {
            return sum(separateNumberString(convertToOneDelimiter(numbers)));
        } else if (startsWithSlashes(numbers)) {
            if (startsWithBracket(numbers)) {
                return sum(separateNumberString(getCleanStringNumbers(numbers), obtaindelimiter(numbers)));
            } else {
                return sumWithDelimiter(numbers);
            }
        }
        return 0;

    }
    /** */
    public int sum(String[] numbersString) {
        return sumIntArray(convertNumberStringToInteger(numbersString));
    }
    /** */
    public int sumWithDelimiter(String numbers) {
        int posDelimeter = 2;
        int posNumbersBegin = 2 + 2;
        String delimiter = numbers.substring(2, posDelimeter + 1);
        String numbersWithoutDelimeter = numbers.substring(posNumbersBegin);
        String[] numbersString = numbersWithoutDelimeter.split(delimiter);
        return sum(numbersString);
    }

    /** */
    public String sumWithNegativeOnes(String numbers) {
        String[] numbersString = numbers.split(",");
        String negativeNumbers = "negatives not allowed ";
        for (String number : numbersString) {
            int numberInt = Integer.parseInt(number);
            if (numberInt < 0) {
                negativeNumbers += numberInt + ", ";
            }
        }
        return negativeNumbers;
    }

    /** */
    public int sumWithDelimitersInBrackets(String numbers) {
        return sum(getStringnumbersArray(numbers));

    }

    /**
     * sum every number inside the array.
    */
    public int sumIntArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (!isNegative(number) && isUnderLimit(number)) {
                sum += number;
            }
        }
        return sum;
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
    public String getCleanStringNumbers(String numbers) {
        return numbers.substring(numbers.indexOf("\n") + 1);
    }

    /** */
    public String[] getStringnumbersArray(String numbers) {
        String realNumbers = getCleanStringNumbers(numbers);
        String delimiters = obtaindelimiter(numbers);
        if (!delimiters.contains("\n")) {
            return separateNumberString(realNumbers, delimiters);
        } else {
            return separateNumberString(realNumbers, separateNumberString(delimiters, "\n"));
        }
    }
    /**
     *
     */
    public String obtaindelimiter(String numbers) {
        String delimiters = numbers.substring(0, numbers.indexOf("\n"));
        int openedBracket = 0;
        int closedBracket = 0;
        boolean esta = false;
        String delimitersWithSpaces = "";
        do {
            openedBracket = delimiters.indexOf("[");
            closedBracket = delimiters.indexOf("]");
            delimitersWithSpaces += delimiters.substring(openedBracket + 1, closedBracket);
            if (closedBracket != delimiters.length() - 1) {
                delimiters = delimiters.substring(closedBracket + 1);
                delimitersWithSpaces += "\n";
            } else {
                esta = true;
            }
        } while (!esta);
        return delimitersWithSpaces;
    }
    /**
     *
     */
    public String[] separateNumberString(String numberString) {
        return separateNumberString(numberString, COMMA);
    }
    /**
     *
     */
    public String[] separateNumberString(String numberString, String delimiter) {
        return numberString.split(delimiter);
    }
    /**
     *
     */
    public String[] separateNumberString(String numberString, String[] delimiters) {
        for (String delimiter : delimiters) {
            convertToOneDelimiter(numberString, delimiter);
        }
        return numberString.split(numberString);
    }

    /**
     *
     */
    public int[] convertNumberStringToInteger(String[] stringNumbers) {
        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        return numbers;
    }

    /** */
    public Boolean startsWithSlashes(String numbers) {
        return numbers.startsWith("//");
    }
    /** */
    public Boolean startsWithBracket(String numbers) {
        return numbers.startsWith("[");
    }
    /** */
    public Boolean startsWithNumber(String numbers) {
        return numbers.substring(0, 1).matches("[0-9]") || numbers.substring(0, 1).matches("-");
    }
    /** */
    public String convertToOneDelimiter(String numbers) {
        return numbers.replaceAll(NEXT_LINE, COMMA);
    }
    /** */
    public String convertToOneDelimiter(String numbers, String delimiter) {
        return numbers.replaceAll(delimiter, COMMA);
    }
}
