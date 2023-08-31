package ru.gb.jcore.regular;
/**
 * Class Calculator
 * Realized four different maths
 */
public class Calculator {
    /**
     * sum - summing two numbers
     * @ param number1 - first number
     * @ param number2 - second number
     * @ return sum of number1 and number2
     * */
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
    /**
     * mult - multiplicating two numbers
     * @ param number1 - first number
     * @ param number2 - second number
     * @ return multiplication of number1 and number2
     * */

    public static int mult(int number1, int number2) {
        return number1 * number2;
    }
    /**
     * subt - subtraction of numbers
     * @ param number1 - first number
     * @ param number2 - second number
     * @ return difference between number1 and number2
     * */

    public static int subt(int number1, int number2) {
        return number1 - number2;

    }
    /**
     * dev - deviding two numbers
     * @ param number1 - first number
     * @ param number2 - second number
     * @ return quotiont of number1 and number2
     * */

    public static int dev(int number1, int number2) {
        return number1 / number2;
    }
}