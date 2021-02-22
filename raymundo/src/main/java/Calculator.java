public class Calculator {

    public int add(String numbers) {
        int sum = 0;
        if (numbers == "") {
            return 0;
        } else {
            String[] numbersArray = numbers.split(",");
            for (String number : numbersArray) {
                sum += Integer.parseInt(number);
            }
            return sum;
        }
    }
}
