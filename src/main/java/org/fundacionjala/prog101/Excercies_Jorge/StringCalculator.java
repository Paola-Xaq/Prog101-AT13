package org.fundacionjala.prog101.Excercies_Jorge;

public class StringCalculator {
    public int add (String numsToSum){
        if (numsToSum.isEmpty()) {
            return 0;
        }
        String[] arrayofNumbers = getArrayOfNums(numsToSum);
        String negativeNumbers = getNegatives(arrayofNumbers);
        if (negativeNumbers.equals("Negatives are :")) {
            return sumNums(arrayofNumbers);
        }else{
            throw new IllegalArgumentException("negatives not allowed " + negativeNumbers);
        }

    }
    public String[] getArrayOfNums(String nums){
        String delimiter ="";
        String[] arrayStringNumbers;
        if(hasDelimiter(nums)){
            delimiter= getDelimiter(nums);
            arrayStringNumbers = nums.split("\n");
            return arrayStringNumbers[1].split(delimiter);
        }else {
            delimiter = ",|\n";
            return nums.split(delimiter);
        }
    }
    public boolean hasDelimiter(String limiter){
        return limiter.startsWith("//");
    }
    public String getDelimiter(String limiter){
        return limiter.substring(2,3);
    }
    public int sumNums(String[] nums){
        int sum = 0;
        final int maxLimit = 1000;
        for (String number : nums) {
            int num = Integer.parseInt(number);
            if (num <= maxLimit) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
    public String getNegatives(String[] numbers){
        String negativesNumbers= "Negatives are :";
        for (String negative : numbers) {
            int num = Integer.parseInt(negative);
            if (num < 0) {
                negativesNumbers = negativesNumbers + " " + negative;
            }
        }
        return negativesNumbers;
    }
}
