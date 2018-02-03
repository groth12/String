package edu.ithaca.roth;

import java.util.ArrayList;
import java.util.List;

public class StringCalculatorimpl implements StringCalculator{
    @Override
    public int Add(String numbers) {
        int total = 0;
        int lastComma = 0;
        List<Integer> commas = new ArrayList<>();
        for (int i = 0; i < numbers.length(); i++) {

            if (numbers.charAt(i) == ',') {
                commas.add(i);
                //  total = total + Integer.parseInt(numbers.charAt(i) + "");
            }
        }
        for (int i = 0; i < commas.size(); i++){
            String number = numbers.substring(lastComma, commas.get(i));
            System.out.println(lastComma + " " + commas.get(i));
            System.out.println("Number is: " + number);
            lastComma = commas.get(i)+1;
            if (!number.equals("")){
                int addition = Integer.parseInt(number);
                total += addition;
            }
        //    System.out.println("Total is now: " + total);
        }
        total = total + Integer.parseInt(numbers.substring(lastComma, numbers.length()));
        System.out.println("Total is: " + total);
        return total;
    };
}
