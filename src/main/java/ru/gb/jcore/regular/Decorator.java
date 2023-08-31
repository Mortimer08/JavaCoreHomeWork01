package ru.gb.jcore.regular;
/**
 * Class decorator
 * Decorates results of calculating
 */

public class Decorator{
    /**
     * result - dedorates rusults
     * @ param number - number, have to be decorated
     * @ param operation - name of the math operation
     * @ return string with numbers and words
     */
    public String result (int number, String operation){
        return String.format("Result of %s is %d", operation, number);
    }
}