
class DeleteMidldleNode {

    public static void main(String[] args) throws java.lang.Exception {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(6);
        head.appendToTail(7);
        head.appendToTail(8);
        head.appendToTail(9);
        head.appendToTail(10);
        head.appendToTail(11);

        head.print();

        GetMiddleNode(head);
        head.print();

    }

    public static void GetMiddleNode(Node head) {

        Node p1 = head;
        Node p2 = head;

        int k = 0;
        int y = 0;

        //Get LinkedList Length
        while (p1 != null) {
            p1 = p1.next;
            k++;
        }

        //Go to middle - 1 and jump the middle Node
        if ((k % 2) != 0) {

            while (y < (k / 2) - 1) {
                p2 = p2.next;
                y++;

            }

            //Set middleNode = to middle node of LinkedList
            Node middleNode = p2.next;
            deleteNode(middleNode);

        }

    }

    public static boolean deleteNode(Node n) {
        if (n == null || n.next == null) {
            return false;
        }

        Node nextNode = n.next;
        n.data = n.next.data;
        n.next = nextNode.next;

        return true;

    }
}
