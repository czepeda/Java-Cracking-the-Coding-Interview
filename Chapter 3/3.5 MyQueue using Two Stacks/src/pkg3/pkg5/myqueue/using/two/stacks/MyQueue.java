/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg5.myqueue.using.two.stacks;

/**
 *
 * @author czepeda
 */
import java.util.Stack;

public class MyQueue<T> {

    Stack<T> stackOldest, stackNewest;

    public MyQueue() {

        stackOldest = new Stack<T>();
        stackNewest = new Stack<T>();

    }

    public int size() {
        return stackNewest.size() + stackOldest.size();

    }

    public void add(T value) {
        // Push onto stack1

        stackNewest.add(value);

    }

    /* Move elements from stackNewest into stackOldest. This is usually done so that we can
     * do operations on stackOldest.
     */
    public void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }

    }

    public T peek() {
        shiftStacks();
        // retrieve the oldest item.
        return stackOldest.peek();

    }

    public T remove() {
        shiftStacks();
        // pop the oldest item.
        return stackOldest.pop();

    }

    public void printQueue() {
        System.out.print("[HEAD] ");
        for (int i = stackOldest.size() - 1; i >= 0; --i) {
            System.out.print(stackOldest.get(i) + " ");
        }
        System.out.print("| ");

        for (T item : stackNewest) {
            System.out.print(item + " ");
        }
        System.out.println("[TAIL]");
        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue my = new MyQueue();

        for (int i = 1; i <= 5; ++i) {
            System.out.println("Added " + i);
            my.add(i);
        }

        //System.out.println(my.peek());
        //my.shiftStacks();
        my.printQueue();
        System.out.println("Remove: " + my.remove());
        my.printQueue();

        my.add(77);
        my.printQueue();

        my.add(78);
        my.printQueue();

        my.remove();
        my.remove();
        my.remove();
        my.remove();

        my.add(81);
        my.remove();
        my.printQueue();

    }
}
