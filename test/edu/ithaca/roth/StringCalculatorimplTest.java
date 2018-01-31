package edu.ithaca.roth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorimplTest {
    @org.junit.jupiter.api.Test
    void AddTest(){
        StringCalculator myFunctions = new StringCalculatorimpl();
        String numbers  = "1";
        assertEquals("", numbers, "No input!");
        /*
        int total = numbers.charAt(0) + numbers.charAt(1) + numbers.charAt(2);
        assertEquals(total, numbers.get(0) + numbers.get(1) + numbers.get(2), "Numbers not equal!");
       */
        int total = myFunctions.Add(numbers);
    }
}
