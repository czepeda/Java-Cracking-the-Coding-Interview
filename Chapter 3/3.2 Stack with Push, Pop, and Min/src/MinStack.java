
public class MinStack {

    int stackSize;
    int stack[];
    int minstack[];
    int top = -1, mintop = -1;

    public static void main(String[] args) throws Exception {
        MinStack min = new MinStack(100);
        min.push(5);
        min.push(8);
        min.push(5);
        min.push(6);
        min.push(5);
        min.push(5);
        min.push(5);
        min.push(15);
        min.push(5);
        min.push(0);
        System.out.println("The poped element is: " + min.pop());
        System.out.println("The minimun element is: " + min.min());

    }

    public MinStack(int size) {
        stackSize = size;
        stack = new int[size];
        minstack = new int[size];

    }

    public void push(int value) throws Exception {
        if (top + 1 >= stackSize) {
            throw new Exception("Out of memory!");
        }
        top++;
        stack[top] = value;

        if (mintop == -1 || value <= minstack[mintop]) {
            mintop++;
            minstack[mintop] = value;
        }

    }

    public int pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty");
        }
        int value = stack[top];
        top--;
        if (value == minstack[mintop]) {
            mintop--;
        }

        return value;

    }

    public int min() throws Exception {
        if (mintop == -1) {
            throw new Exception("No element in stack");

        }
        return minstack[mintop];
        
    }

}
