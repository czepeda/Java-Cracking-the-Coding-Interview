/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg1.string.unique.characters;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author czepeda
 */
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(isUniqueChars2("aadn"));

    }

    public static boolean isUniqueChars2(String str) {

        if (str.length() > 256) {
            return false;
        }

        boolean[] char_set = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            //System.out.println(val);

            if (char_set[val]) {
                return false;
            }
            (char_set[val]) = true;
        
        }

        return true;
    }

}
