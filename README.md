# Bit Calculus - Binary Calculator

[![Live Visualizer](https://img.shields.io/badge/🌐_Interactive_Demo-Visit_Web_App-007ACC?style=for-the-badge&logo=vercel&logoColor=white)](https://binary-bitwise-calculator.vercel.app)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](#)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](#)

This project is a modular Java engine built to execute and demonstrate **Binary Arithmetic**, **Bitwise Logic**, and **Register Bit Manipulations** at the machine level. The core logic is structured across specialized classes: **BitwiseOperations** handles low-level logic gates **(AND, OR, XOR, NOT)** and shifts; **ArithmeticOperations** manages binary arithmetic bounded by specific bit-widths using bit-masking; **BitArray** models an interactive register allowing direct bit-level state manipulation; and **BinaryFormatter** formats representations across **Binary**, **Decimal**, and **Hexadecimal** formats with step-by-step operation breakdowns.

---

## Importance

In modern computing, high-level code ultimately executes as hardware-level voltage state shifts representing binary zeros (`0`) and ones (`1`). Mastered bitwise manipulation enables:

1. **Hardware Architecture & CPU Design**: Digital logic gate execution (AND, OR, NOT, XOR) inside the Arithmetic Logic Unit (ALU).
2. **Memory Overhead Optimization**: Packing multiple boolean status flags or compact fields into single byte fields.
3. **Graphics Processing & DSP**: Efficient RGBA color manipulation, image filtering, and digital audio transformations.
4. **Networking & CIDR**: IP address routing, subnet mask matching, and packet header analysis.
5. **Cryptography & Hash Functions**: Block cipher routines (AES, ChaCha20) utilizing XOR operations and bit rotations.

---

## Operational Mechanics & Technical Details

<details>
<summary><b>1. Binary Arithmetic</b> <i>(Click to expand)</i></summary>

### Binary Addition (`+`)

Binary addition uses four basic truth rules:

- $0 + 0 = 0$
- $0 + 1 = 1$
- $1 + 0 = 1$
- $1 + 1 = 0 \text{ (carry 1)}$

```text
  Carry:  1 1 1 0
          1 0 1 1  (11)
        + 0 1 0 1  (5)
        ---------
        1 0 0 0 0  (16)
```

### Binary Subtraction (-)

Calculated via direct bit borrowing or Two's Complement addition (A−B=A+(−B)):

- $0 − 0 = 0$
- $1 − 0 = 1$
- $1 − 1 = 0$
- $0 − 1 = 1 \text{(borrow 1 from next higher bit)}$

```text
Borrow:   0 1 1 0
          1 1 0 0  (12)
        - 0 1 0 1  (5)
        ---------
          0 1 1 1  (7)
```

### Binary Multiplication (×)

Operates like traditional long multiplication. Partial products are generated for set bits (1), shifted left according to bit position, and summed.

```text
            1 0 1   (5)
          × 0 1 1   (3)
          -------
            1 0 1   (Shift 0)
        + 1 0 1 0   (Shift 1)
        ---------
          1 1 1 1   (15)
```

### Binary Division (÷)

Executed via repeated shift-and-subtract comparison across the dividend bits:

1. Align the divisor with the highest set bits of the dividend.
2. If the divisor fits, record a 1 in the quotient bit and subtract.
3. If it does not fit, record a 0 in the quotient bit.
4. Shift right and repeat until remaining bits are evaluated.

### Bitwise AND (&)

Returns 1 if both corresponding bits are 1, otherwise 0. Frequently used for masking and extracting specific bit fields.

```text
  A:   1 1 0 1
  B:   1 0 1 1
  -------------
A & B: 1 0 0 1
```

### Bitwise OR (|)

Returns 1 if at least one corresponding bit is 1. Frequently used to set or activate bit flags.

```text
  A:   1 1 0 1
  B:   1 0 1 1
  -------------
A | B: 1 1 1 1
```

### Bitwise XOR (^ - Exclusive OR)

Returns 1 if corresponding bits are different, and 0 if they are identical. Crucial for toggle states, parity checks, and cryptographic ciphers.

```text
  A:   1 1 0 1
  B:   1 0 1 1
  -------------
A ^ B: 0 1 1 0
```

### Bitwise NOT (~)

Inverts every bit in the input (0 becomes 1, and 1 becomes 0). In Signed Two's Complement notation, ~A = -(A + 1).

```text
    A: 1 0 1 1  (11)
  ~ A: 0 1 0 0  (4 in 4-bit unsigned mode)
```

### Left Shift (<<)

Shifts all bits left by N positions, filling vacant bits on the right with 0. Equivalent to integer multiplication by 2^N.

```text
       A:   0 0 0 0 0 1 0 1  (5)
  A << 2:   0 0 0 1 0 1 0 0  (20 => 5 × 2²)
```

### Right Shift (>>)

Shifts all bits right by N positions, discarding shifted-off bits. Equivalent to integer floor division floor(A / 2^N).

```text
       A:   0 0 0 1 0 1 0 0  (20)
  A >> 2:   0 0 0 0 0 1 0 1  (5 => floor(20 / 2²))
```

## Features

1. **Interactive Bit Grid:** Toggle individual bits (Bit 0 to Bit 7) with a single click or tap to observe real-time recalculations.
2. **Dual Integer Modes:** Switch seamlessly between Unsigned (0 to 255) and Signed Two's Complement (-128 to +127) modes.
3. **Synchronized Numeral Systems:** Instantaneous conversion across Binary, Decimal, and Hexadecimal notations.
4. **Step-by-Step Breakdown:** Detailed mathematical breakdowns, binary alignments, and intermediate results for every operation.
5. **Operation History Log:** Interactive log recording prior calculations for easy reference and step review.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Copyright (c) 2026 Massao Tani
