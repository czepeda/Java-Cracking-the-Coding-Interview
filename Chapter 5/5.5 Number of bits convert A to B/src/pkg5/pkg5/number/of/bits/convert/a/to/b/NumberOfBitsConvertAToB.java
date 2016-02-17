/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg5.number.of.bits.convert.a.to.b;

/**
 * Write a function to determine the number of bits required to convert integer
 * A to integer B.
 *
 * EXAMPLE Input: 31, 14 (11111, 1110) Output: 2
 */
public class NumberOfBitsConvertAToB {

    public static int bitSwapRequired(int a, int b) {

        int count = 0;
        for (int c = a ^ b; c != 0; c = c & (c - 1)) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int a = 31, b = 14;
        System.out.println(Integer.toBinaryString(a) + " " + Integer.toBinaryString(b));
        System.out.println("bitSwapRequired: " + bitSwapRequired(a, b));
    }
}
