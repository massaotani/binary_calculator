package com.binary_calculator;

public class BitwiseOperations {

    public static int and(int a, int b) {
        return a & b;
    }

    public static int or(int a, int b) {
        return a | b;
    }

    public static int xor(int a, int b) {
        return a ^ b;
    }

    public static int not(int a, int bitWidth) {
        int mask = (1 << bitWidth) - 1;
        return (~a) & mask;
    }

    public static int shiftLeft(int value, int positions, int bitWidth) {
        int mask = (1 << bitWidth) - 1;
        return (value << positions) & mask;
    }

    public static int shiftRight(int value, int positions) {
        return value >>> positions; // Logical right shift
    }
}