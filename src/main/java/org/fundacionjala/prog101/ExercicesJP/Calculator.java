package org.fundacionjala.prog101.ExercicesJP;

public class Calculator {
    public int add(String numbers){
        if(!numbers.isEmpty()){
            String[] arrayNumbers = numbers.split("[,]");
            int sum = 0;
            for (String number : arrayNumbers) {
                return sum += Integer.parseInt(number);
            }
        }
        return 0;
    }
}
