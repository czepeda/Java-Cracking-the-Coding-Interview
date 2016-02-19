/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg6.swap.odd.and.even.bits;

/**
 *
 * @author czepeda
 */
public class SwapOddAndEvenBits {

    public static int swapOddEvenBits(int x) {
        //XXX: 
        // 0xAAAAAAAA -> mask: 10101010...
        // 0x55555555 -> mask: 01010101...
        // for 32-bit integers
        return ((x & 0xAAAAAAAA) >> 1) | ((x & 0x55555555) << 1);
    }

    public static void main(String[] args) {
        System.out.println("Integer 170 to binary: " + Integer.toBinaryString(170));

        System.out.println("Integer 170 bits swapped: " + Integer.toBinaryString(swapOddEvenBits(170)));

    }

}
