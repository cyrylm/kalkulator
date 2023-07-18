package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator calculator = new Calculator();
        int silnia= calculator.silnia(5);
        System.out.println(silnia);
    }
}
