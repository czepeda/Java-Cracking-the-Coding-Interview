
class CircularLinkedList {

    public static void main(String[] args) throws java.lang.Exception {
        Node head = new Node("A");
        head.appendToTail("B");
        head.appendToTail("C");
        head.appendToTail("D");
        head.appendToTail("E");
        //loopNode.print();

        //Get Node C where the Node starts to loop assigned as n
        Node n = head;
        for (int i = 0; i < 2; i++) {
            n = n.next;
        }
        System.out.println("The node that starts the loop: " + n.data);

        Node x = head;
        while (x.next != null) {
            x = x.next;
        }
        x.next = n;

        //head.print();
        findBeginning(head);
    }

    public static Node findBeginning(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println("Node where the loop starts: " + slow.data);
        return slow;

    }
}
