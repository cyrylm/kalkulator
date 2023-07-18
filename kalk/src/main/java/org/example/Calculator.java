package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int suma(int a, int b) {
        return 0;
    }

    public int silnia(int number) {
        int fact=1;
        for (int x=1;x<=number;x++){
            fact=fact*x;
        }
        return fact;
    }

    public static List<Integer> fib(int input) {
        List<Integer> wyniki = new ArrayList<>();

        int a = 0;
        int b = 1;

        while (a < input) {
            wyniki.add(a);
            int temp = a;
            a = b;
            b = temp + b;
        }


        return wyniki;
    }

    public static void main(String[] args) {
        int inputNumber = 10;
        List<Integer> numbersList = fib(inputNumber);
        System.out.println("Liczby mniejsze od " + inputNumber + ": " + numbersList);
    }

}

