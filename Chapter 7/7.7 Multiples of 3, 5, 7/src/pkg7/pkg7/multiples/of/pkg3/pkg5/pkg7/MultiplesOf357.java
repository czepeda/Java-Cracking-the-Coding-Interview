/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg7.multiples.of.pkg3.pkg5.pkg7;

/**
 *
 * @author czepeda
 */
import java.util.LinkedList;

/**
 *
 * @author czepeda
 */
/**
 * Design an algorithm to find the kth number such that the only prime factors
 * are 3, 5, and 7.
 */
public class MultiplesOf357 {

    public static int findKthNum(int k) {
        if (k <= 0) {
            return -1;
        }
        int num = 1;
        LinkedList<Integer> q3 = new LinkedList<Integer>();
        LinkedList<Integer> q5 = new LinkedList<Integer>();
        LinkedList<Integer> q7 = new LinkedList<Integer>();
        q3.add(num);

        for (int i = 0; i < k; i++) {
            int n3 = q3.isEmpty() ? Integer.MAX_VALUE : q3.peek();
            int n5 = q5.isEmpty() ? Integer.MAX_VALUE : q5.peek();
            int n7 = q7.isEmpty() ? Integer.MAX_VALUE : q7.peek();
            num = Math.min(n3, Math.min(n5, n7));
            if (num == n3) {
                q3.removeFirst();
                q3.add(3 * num);
                q5.add(5 * num);
                q7.add(7 * num);
            } else if (num == n5) {
                q5.removeFirst();
                q5.add(5 * num);
                q7.add(7 * num);
            } else if (num == n7) {
                q7.removeFirst();
                q7.add(7 * num);
            }
        }

        return num;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; ++i) {
            System.out.println(findKthNum(i));
        }
    }
}
