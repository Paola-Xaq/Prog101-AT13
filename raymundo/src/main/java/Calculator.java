public class Calculator {
    public String defaultDelimiter = ",|\n";
    public String[] numbersArray;
    public int result;
    
    public int add(String numbers) {
        int sum = 0;
        if (numbers == "") {
            return 0;
        } else {
            if (numbers.startsWith("//")) {
                String[] delimiterNumbers = numbers.split("\n", 2);
                String delimiter = Character.toString(delimiterNumbers[0].charAt(2));
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
                sum += Integer.parseInt(number);
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
}
