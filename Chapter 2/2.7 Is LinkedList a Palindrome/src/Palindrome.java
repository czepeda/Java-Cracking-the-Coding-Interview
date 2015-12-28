
import java.util.Stack;

class Palindrome {

    public static void main(String[] args) throws java.lang.Exception {
        Node head = new Node(0);
        //head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(1);
        head.appendToTail(0);
        //loopNode.print();

        head.print();
        isPalindrome(head);
    }

    public static boolean isPalindrome(Node head) {
        Node fast = head;
        Node slow = head;
        Stack<Integer> stack = new Stack<Integer>();
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            stack.push(slow.data);
            slow = slow.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int top = stack.pop().intValue();
            if (slow.data != top) {
                System.out.println("Not Palindrome!");
                return false;
            }
            slow = slow.next;
        }
        System.out.println("Is Palindrome!");
        return true;

    }
}
