package com.binary_calculator;

public class Main {

    public static void main(String[] args) {
        int bitWidth = 8; // Default 8-bit mode

        // Example 1: Arithmetic Addition (11 + 5)
        int a = 11; // 00001011
        int b = 5;  // 00000101
        int sum = ArithmeticOperations.add(a, b, bitWidth);

        System.out.println(BinaryFormatter.getStepByStepExplanation("+", a, b, sum, bitWidth));

        // Example 2: Bitwise AND
        int andResult = BitwiseOperations.and(a, b);
        System.out.println(BinaryFormatter.getStepByStepExplanation("AND", a, b, andResult, bitWidth));

        // Example 3: Interactive BitArray Manipulation
        BitArray register = new BitArray(bitWidth);
        register.setValue(a); // Set initial value to 11
        System.out.println("Original Register Binary : " + BinaryFormatter.toBinaryString(register.getValue(), bitWidth));

        register.toggleBit(2); // Toggle bit 2 (weight 4)
        System.out.println("After Toggling Bit 2     : " + BinaryFormatter.toBinaryString(register.getValue(), bitWidth));
        System.out.println("New Decimal Value        : " + register.getValue());
    }
}