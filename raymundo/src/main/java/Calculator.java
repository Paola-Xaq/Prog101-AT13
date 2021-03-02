public class Calculator {
    public String defaultDelimiter = ",|\n";
    public String[] numbersArray;
    public int result;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add("-2,2,-1"));
        System.out.println(calculator.add(""));
        System.out.println(calculator.add("1"));
        System.out.println(calculator.add("1,2"));
        System.out.println(calculator.add("1,2,3,4,5"));
        System.out.println(calculator.add("1\n2,3"));
        System.out.println(calculator.add("//;\n1;2"));
        System.out.println(calculator.add("2,1001"));
        System.out.println(calculator.add("//[--]\n1--2--3"));
        System.out.println(calculator.add("//[-][%]\n1-2%3"));
    }

    /**
     * Method to add numbers
     * @param numbers a string with the numbers
     * @return the sum of the numbers
     * */
    public int add(String numbers) {
        if (numbers == "") {
            return 0;
        } else {
            if (numbers.startsWith("//")) {
                String[] delimiterNumbers = numbers.split("\n", 2);
                String delimiterString = delimiterNumbers[0];
                String delimiter = getDelimiter(delimiterString);
                numbers = delimiterNumbers[1];
                numbersArray = separateString(numbers, delimiter);
            } else {
                numbersArray = separateString(numbers, defaultDelimiter);
            }
            try {
                result = sumNumbersArray(numbersArray);
            } catch (ExceptionNegativesNotAllowed exception) {
                System.out.println(exception.getMessage());
            }
            return result;
        }
    }

    /**
     * Method to separate a string according to the delimiter
     * @param string the string to separate
     * @param delimiter the character to separate
     * @return a stringArray
     * */
    public String[] separateString(String string, String delimiter) {
        String[] stringArray = string.split(delimiter);
        return stringArray;
    }

    /**
     * Method to sum a string array
     * @param numbersArray the array to sum
     * @return an int with the sum
     * */
    public int sumNumbersArray(String[] numbersArray) throws ExceptionNegativesNotAllowed {
        int sum = 0;
        String negativeNumbersArray = "";
        for (String number : numbersArray) {
            if (notNegative(number)) {
                if (notHigherThanAThousand(number)) {
                    sum += Integer.parseInt(number);
                }
            } else {
                negativeNumbersArray += number + " ";
            }
        }
        if (negativeNumbersArray != "") {
            throw new ExceptionNegativesNotAllowed(negativeNumbersArray);
        }
        return sum;
    }

    /**
     * Method to check if a number is negative
     * @param number the number to check
     * @return a boolean with the answer
     * */
    public Boolean notNegative(String number) {
        return (Integer.parseInt(number) >= 0);
    }

    /**
     * Method to check if a number is higher than 1000
     * @param number an int to check
     * @return a boolean with the answer
     * */
    public Boolean notHigherThanAThousand(String number) {
        return (Integer.parseInt(number) <= 1000);
    }

    /**
     * Method to get the delimiter of a string
     * @param string the string where we search for the delimiter
     * @return a string with the delimiter
     * */
    public String getDelimiter(String string) {
        String delimiter;
        if(countCharacter(string, "]") > 1) {
            delimiter = getMultipleDelimiter(string);
        }
        else {
            if (string.contains("[") && string.contains("]")) {
                int firstPosition = string.indexOf("[");
                int lastPosition = string.indexOf("]");
                delimiter = string.substring(firstPosition + 1, lastPosition);
            } else {
                delimiter = Character.toString(string.charAt(2));
            }
        }
        return delimiter;
    }

    /**
     * Method to count how many characters of a type are on a string
     * @param string the string where the character is
     * @param stringWanted the pretended string
     * @return the number of characters
     * */
    public int countCharacter(String string, String stringWanted) {
        int position;
        int sum = 0;
        position = string.indexOf(stringWanted);
        while (position != -1) {
            sum += 1;
            position = string.indexOf(stringWanted, position + 1);
        }
        return sum;
    }

    /**
     * Method to get various delimiters
     * @param string the string to search for delimiters
     * @return a string with the delimiter
     * */
    public String getMultipleDelimiter(String string) {
        String delimiter = "";
        char[] characters = string.toCharArray();
        for (char character : characters) {
            if (!Character.toString(character).equals("/") && !Character.toString(character).equals("[") && !Character.toString(character).equals("]")){
                delimiter += character + "|";
            }
        }
        delimiter = delimiter.substring(0, delimiter.length() - 1);
        return delimiter;
    }
}
