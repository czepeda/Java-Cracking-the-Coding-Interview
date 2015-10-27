/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg8.substring;

/**
 *
 * @author czepeda
 */
public class Substring {

    public static void main(String[] args) {

        String s1 = "icecube";
        String s2 = "cubeice";
        System.out.println(isRotation(s1, s2));

    }

    public static boolean isRotation(String s1, String s2) {
        int len = s1.length();
        /* check that s1 and s2 are equal length and not empty */
        if (len == s2.length() && len > 0) {
            /* concatenate s1 and s1 within new buffer */
            String s1s1 = s1 + s1;
            System.out.println(s1s1);
            return isSubstring(s1s1, s2);
        }
        return false;
    }

    private static boolean isSubstring(String s1s1, String s2) {
        return s1s1.contains(s2);
    }

}
