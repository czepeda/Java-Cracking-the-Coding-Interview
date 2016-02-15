/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg2.print.pkgdouble.number.as.a.binary.representation;

/**
 * Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a
 * double, print the binary representation. If the number cannot be represented
 * accurately in binary with at most 32 characters, print "ERROR".
 */
public class PrintDoubleNumberAsABinaryRepresentation {

    // To print the decimal part, we can multiply by 2 and check if
    // 2*n is greater than or equal to 1.
    public static String printBinary(double num) {
        if (num >= 1 || num <= 0) {
            return "ERROR";
        }

        StringBuilder binary = new StringBuilder();
        binary.append(".");

        while (num > 0) {
            if (binary.length() >= 32) {
                return "ERROR";
            }

            double r = num * 2;

            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }

        }
        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println(printBinary(0.0));
        System.out.println(printBinary(0.25));
        System.out.println(printBinary(0.025));
        System.out.println(printBinary(0.75));
        System.out.println(printBinary(0.750001));
    }
}
