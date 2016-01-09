/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg5.compress.count;

/**
 *
 * @author czepeda
 */
public class CompressCount {

    public static void main(String[] args) {
        String str = "aabcc";
        System.out.println(compressBad(str));

    }

    private static String compressBad(String str) {

        String mystr = " ";
        int count = 1;
        char last = str.charAt(0);
        
        
        for(int i = 1; i<str.length(); i++){
            
            if(last == str.charAt(i)){
                count++;
            }else{
                mystr += last + "" + count;
                last = str.charAt(i);
                count = 1;
            }
            
        }
        
        return mystr + last + count;
    }

}
