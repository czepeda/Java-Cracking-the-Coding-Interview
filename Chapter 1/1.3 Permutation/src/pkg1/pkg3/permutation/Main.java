/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg3.permutation;

/**
 *
 * @author czepeda
 */
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(checkPermutation("Adan", "Adan"));

    }

    public static boolean checkPermutation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);

    }
}
