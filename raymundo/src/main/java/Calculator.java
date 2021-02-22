public class Calculator {
    public String defaultDelimiter = ",|\n";
    public String[] numbersArray;
    public int result;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add("-1,-2,-3");
    }

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

    public String[] separateString(String string, String delimiter) {
        String[] stringArray = string.split(delimiter);
        return stringArray;
    }

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

    public Boolean notNegative(String number) {
        return (Integer.parseInt(number) >= 0);
    }

    public Boolean notHigherThanAThousand(String number) {
        return (Integer.parseInt(number) <= 1000);
    }

    public String getDelimiter(String string) {
        String delimiter;
        if (string.contains("[") && string.contains("]")) {
            int firstPosition = string.indexOf("[");
            int lastPosition = string.indexOf("]");
            delimiter = string.substring(firstPosition + 1, lastPosition);
        } else {
            delimiter = Character.toString(string.charAt(2));
        }
        return delimiter;
    }
}
