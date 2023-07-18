package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Test;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Fibtest {

    @Test
    public void testFib() {

        int inputNumber = 50;

        List<Integer> wyniki = fib(inputNumber);

        assertEquals(10, wyniki.size());
        int[] liczby = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        for (int i = 0; i < wyniki.size(); i++) {
            assertEquals(liczby[i], wyniki.get(i).intValue());
        }
    }
}