/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg3.find.next.smallest.and.largest.numbers;

/**
 *
 * @author czepeda
 */
/**
 * Given a positive integer, print the next smallest and the next largest number
 * that have the same number of 1 bits in their binary representation.
 */
public class FindNextSmallestAndLargestNumbers {

    public static int getNext(int n) {
        assert n > 0;
        int numOnes = countNumOnes(n);
        for (int i = n + 1; i <= Integer.MAX_VALUE; i++) {
            if (countNumOnes(i) == numOnes) {
                return i;
            }
        }
        return -1;
    }

    public static int getPrev(int n) {
        assert n > 0;
        int numOnes = countNumOnes(n);
        for (int i = n - 1; i > 0; i--) {
            if (countNumOnes(i) == numOnes) {
                return i;
            }
        }
        return -1;
    }

    private static int countNumOnes(int n) {
        int cnt = 0;
        for (int i = n; i > 0; i &= (i - 1)) {
            cnt++;
        }
        return cnt;
    }

    //TEST----------------------------------
    public static void main(String[] args) {
        test(5);
        test(50);
    }

    private static void test(int n) {
        System.out.println(n + " (" + Integer.toBinaryString(n) + ")");
        int next = getNext(n), prev = getPrev(n);
        System.out.println("next: " + next + " (" + Integer.toBinaryString(next) + ")");
        System.out.println("prev: " + prev + " (" + Integer.toBinaryString(prev) + ")");
        System.out.println();
    }
}
