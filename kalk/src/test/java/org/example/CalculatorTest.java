package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void silniaTest(){
        Calculator calculator = new Calculator();
        int result = calculator.silnia(3);
        assertEquals(6,result);
    }



}
