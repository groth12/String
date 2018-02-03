package edu.ithaca.roth;

public class StringCalculatorimpl implements StringCalculator{
    @Override
    public int Add(String numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length(); i++) {
            System.out.println("Adding char: " + numbers.charAt(i) + " to " + total);
            total = total + Integer.parseInt(numbers.charAt(i) + "");
            System.out.println("Total is now: " + total);
        }
        System.out.println("Total is: " + total);
        return total;
    };
}
