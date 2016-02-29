/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg4.methods.pkgfor.multiply.subtract.divide;

/**
 *
 * @author czepeda
 */
/**
 * Write methods to implement the multiply, subtract, and divide operations for
 * integers. Use only the add operator.
 */
public class MethodsForMultiplySubtractDivide {

    // returns a - b
    public static int subtract(int a, int b) {
        return a + negate(b);
    }

    // returns -a
    public static int negate(int a) {
        int neg = 0;
        int d = a < 0 ? 1 : -1;
        while (a < 0) {
            neg += d;
            a += d;
        }
        return neg;

    }

    // returns a * b
    public static int multiply(int a, int b) {
        if (a < b) {
            return multiply(b, a);
        }

        int sum = 0;
        for (int i = abs(b); i > 0; i--) {
            sum += a;
        }

        if (b < 0) {
            sum = negate(sum);
        }

        return sum;

    }

    public static int abs(int a) {
        if (a < 0) {
            return negate(a);
        } else {
            return a;
        }
    }

    public static int divide(int a, int b) throws java.lang.ArithmeticException {
        if (b == 0) {
            throw new java.lang.ArithmeticException("ERROR");
        }

        int absa = abs(a);
        int absb = abs(b);

        int product = 0;
        int x = 0;

        while (product + absb <= absa) {
            product += absb;
            x++;
        }

        if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
            return x;
        } else {
            return negate(x);
        }

    }

    public static void main(String[] args) {
        test(9, 4);
        test(0, -1);
        test(-100, 999);
        test(-23456, -56781);
    }

    private static void test(int a, int b) {
        System.out.printf("%d - %d = %d", a, b, subtract(a, b));
        System.out.println();
        System.out.printf("%d * %d = %d", a, b, multiply(a, b));
        System.out.println();
        System.out.printf("%d / %d = %d", a, b, divide(a, b));
        System.out.println();
        System.out.println();
    }
}
