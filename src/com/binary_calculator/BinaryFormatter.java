package com.binary_calculator;

public class BinaryFormatter {

    public static String toBinaryString(int value, int bitWidth) {
        int mask = (1 << bitWidth) - 1;
        String rawBinary = Integer.toBinaryString(value & mask);
        return String.format("%" + bitWidth + "s", rawBinary).replace(' ', '0');
    }

    public static String toHexString(int value, int bitWidth) {
        int mask = (1 << bitWidth) - 1;
        int hexDigits = (int) Math.ceil(bitWidth / 4.0);
        return String.format("%0" + hexDigits + "X", value & mask);
    }

    public static int parseBinary(String binaryStr) {
        return Integer.parseInt(binaryStr, 2);
    }

    public static String getStepByStepExplanation(String op, int a, int b, int result, int bitWidth) {
        String binA = toBinaryString(a, bitWidth);
        String binB = toBinaryString(b, bitWidth);
        String binRes = toBinaryString(result, bitWidth);

        StringBuilder sb = new StringBuilder();
        sb.append("--- Operational Step-by-Step Breakdown ---\n");
        sb.append(String.format("Operand A: %s (%d / 0x%s)\n", binA, a, toHexString(a, bitWidth)));
        sb.append(String.format("Operator : %s\n", op));
        if (!op.equals("NOT")) {
            sb.append(String.format("Operand B: %s (%d / 0x%s)\n", binB, b, toHexString(b, bitWidth)));
        }
        sb.append("-----------------------------------------\n");
        sb.append(String.format("Result   : %s (%d / 0x%s)\n", binRes, result, toHexString(result, bitWidth)));

        return sb.toString();
    }
}