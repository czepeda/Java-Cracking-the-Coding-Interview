
class PartitionLinkedList {

    public static Node partitionLinkedList(Node n, int x) {
        Node beforeStart = null;
        Node afterStart = null;

        while (n != null) {
            Node nextNode = n.next;
            if (n.data < x) {

                n.next = beforeStart;
                beforeStart = n;

            } else {

                n.next = afterStart;
                afterStart = n;

            }
            n = nextNode;
        }

        if (beforeStart == null) {
            return afterStart;
        }
        beforeStart.print();
        afterStart.print();

        Node head = beforeStart;
        while (beforeStart.next != null) {
            beforeStart = beforeStart.next;

        }
        beforeStart.next = afterStart;

        head.print();
        return head;

    }

    public static void main(String[] args) throws java.lang.Exception {
        Node head = new Node(10);

        head.appendToTail(8);
        head.appendToTail(9);
        head.appendToTail(4);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(7);
        head.appendToTail(6);
        head.appendToTail(5);

        head.appendToTail(1);

        head.print();

        //System.out.print("Partition LinkedList: ");
        partitionLinkedList(head, 5);
        //head.print();

    }
}
