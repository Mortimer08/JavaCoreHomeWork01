package ru.gb.jcore.sample;
import ru.gb.jcore.regular.*;
/**
 * Main Class
 */
public class Main{
    /**
     * Execution point
     * */
    public static void main(String args[]){
        Calculator calc = new Calculator();
        Decorator dcr = new Decorator();
        System.out.println(dcr.result(calc.sum(2,3), "summing"));
        System.out.println(dcr.result(calc.mult(2,3), "multiplication"));
    }
}