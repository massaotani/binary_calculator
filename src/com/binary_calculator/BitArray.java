package com.binary_calculator;

public class BitArray {
    private final int bitWidth;
    private int value;

    public BitArray(int bitWidth) {
        this.bitWidth = bitWidth;
        this.value = 0;
    }

    public void setBit(int position, boolean val) {
        if (position < 0 || position >= bitWidth) {
            throw new IndexOutOfBoundsException("Bit position out of bounds: " + position);
        }
        if (val) {
            value |= (1 << position);
        } else {
            value &= ~(1 << position);
        }
    }

    public void toggleBit(int position) {
        if (position < 0 || position >= bitWidth) {
            throw new IndexOutOfBoundsException("Bit position out of bounds: " + position);
        }
        value ^= (1 << position);
    }

    public boolean getBit(int position) {
        return ((value >> position) & 1) == 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        int mask = (1 << bitWidth) - 1;
        this.value = value & mask;
    }

    public int getBitWidth() {
        return bitWidth;
    }
}