
import java.util.EmptyStackException;

public class ArrayStack {

    static int stackSize = 100;
    static int[] buffer = new int[stackSize * 3];
    static int[] stackPointer = {-1, -1, -1};

    public static void main(String[] args) throws Exception {

        push(0, 5);
        push(0, 7);

        System.out.println("Peek 0: " + peek(0));

    }

    static void push(int stackNum, int value) throws Exception {
        if (stackPointer[stackNum] + 1 >= stackSize) {
            throw new Exception("Stack out of memory!");
        }
        stackPointer[stackNum]++;
        buffer[absTopOfStack(stackNum)] = value;

    }

    static int pop(int stackNum) throws Exception {
        if (isEmpty(stackNum)) {
            throw new Exception("Trying to pop empty stack");
        }

        int value = buffer[absTopOfStack(stackNum)];
        buffer[absTopOfStack(stackNum)] = 0;
        stackPointer[stackNum]--;

        return value;
    }

    static int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            throw new EmptyStackException();
        }

        return buffer[absTopOfStack(stackNum)];

    }

    static boolean isEmpty(int stackNum) {
        return stackPointer[stackNum] == -1;

    }

    /* returns index of the top of the stack "stackNum", in absolute terms */
    static int absTopOfStack(int stackNum) {

        return stackNum * stackSize + stackPointer[stackNum];

    }
}
