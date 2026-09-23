package com.binary_calculator;

public class ArithmeticOperations {

    public static int add(int a, int b, int bitWidth) {
        int mask = (1 << bitWidth) - 1;
        return (a + b) & mask;
    }

    public static int subtract(int a, int b, int bitWidth) {
        int mask = (1 << bitWidth) - 1;
        return (a - b) & mask;
    }

    public static int multiply(int a, int b, int bitWidth) {
        int mask = (1 << bitWidth) - 1;
        return (a * b) & mask;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}