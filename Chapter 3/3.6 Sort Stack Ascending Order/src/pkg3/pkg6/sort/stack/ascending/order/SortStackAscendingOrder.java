package pkg3.pkg6.sort.stack.ascending.order;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author czepeda
 */
public class SortStackAscendingOrder {

    //O(N2) time and O(N) space.
    public static Stack<Integer> sortStack(Stack<Integer> s) {
        Stack<Integer> r = new Stack<Integer>();

        while (!s.isEmpty()) {
            int tmp = s.pop();
            while (!r.isEmpty() && r.peek() > tmp) {
                s.push(r.pop());
            }

            r.push(tmp);

        }

        return r;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(8);
        s.push(7);
        s.push(6);
        s.push(5);
        s.push(9);

        System.out.println("Stack before sorted: " + s);

        System.out.print("Stack once sorted: " + sortStack(s));
    }
}
