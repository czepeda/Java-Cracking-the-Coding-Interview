/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg4.check.pkgif.number.is.a.power.of.pkg2;

/**
 *
 * @author czepeda
 */
public class CheckIfNumberIsAPowerOf2 {

    public static boolean PowerOf2(int n) {

        return ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println("Is 5 a Power of 2: " + PowerOf2(5));
        System.out.println("Is 16 a Power of 2: " + PowerOf2(16));
    }

}
