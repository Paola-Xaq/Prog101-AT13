public class Calculator {

    public int add(String numbers) {
        int sum = 0;
        if (numbers == "") {
            return 0;
        } else {
            if (numbers.startsWith("//")) {
                String[] delimiterNumbers = numbers.split("\n", 2);
                String delimiter = Character.toString(delimiterNumbers[0].charAt(2));
                numbers = delimiterNumbers[1];
                String[] numbersArray = numbers.split(delimiter);
                for (String number : numbersArray) {
                    sum += Integer.parseInt(number);
                }
                return sum;
            } else {
                String[] numbersArray = numbers.split(",|\n");
                for (String number : numbersArray) {
                    sum += Integer.parseInt(number);
                }
                return sum;
            }
        }
    }
}
