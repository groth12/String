package edu.ithaca.roth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorimplTest {
    @org.junit.jupiter.api.Test
    void AddTest(){
        StringCalculator myFunctions = new StringCalculatorimpl();
        String numbers  = "1";
        int sum = myFunctions.Add(numbers);
        assertEquals(1, sum, "Expected: 1 Actual: " + sum);

        sum = myFunctions.Add("0");
        assertEquals(0, sum, "Expected: 0 Actual: " + sum);

        sum = myFunctions.Add("-1");
        assertEquals(-1, sum, "Expected: -1 Actual: " + sum);
        /*
        int total = numbers.charAt(0) + numbers.charAt(1) + numbers.charAt(2);
        assertEquals(total, numbers.get(0) + numbers.get(1) + numbers.get(2), "Numbers not equal!");
       */
        //int total = myFunctions.Add(numbers);
    }

    @Test
    void addEmptyTest() {
        StringCalculator calc = new StringCalculatorimpl();

        int sum = calc.Add("");
        assertEquals(0, sum, "Expected: 0 Actual: " + sum);
    }
}
