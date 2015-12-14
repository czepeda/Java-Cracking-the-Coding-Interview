
import java.util.HashMap;

class deleteLinkedListDups {

    /* public static void deletenode2(LinkedListNode head, int d) {
     LinkedListNode n = head;
     // If It's head node
     if (n.data == d) {
     head = n.next;
     }
     //If its other
     while (n.next != null) {
     if (n.next.data == d) {
     n.next = n.next.next;
     }
     n = n.next;
     }
     }*/
    public static void removeDuplicateWithBuffer(Node head) {
        Node n = head;
        Node prev = null;
        HashMap<Integer, Boolean> table = new HashMap<Integer, Boolean>();

        while (n != null) {
            if (table.containsKey(n.data)) {
                prev.next = n.next;

            } else {
                table.put(n.data, true);
                prev = n;

            }
            n = n.next;

        }

    }
    /*public static void removeDuplicateWithoutBuffer(Node head) {
     Node currentNode = head;

     while (currentNode != null) {
     Node runner = currentNode;
     while (runner.next != null) {

     if (runner.next.data == currentNode.data) {
     runner.next = runner.next.next;

     } else {
     runner = runner.next;

     }

     }
     currentNode = currentNode.next;
     }

     }*/

    public static void main(String[] args) throws java.lang.Exception {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(3);

        head.print();

        //System.out.print("After Delete: ");
        //deletenode2(head, 1);
        //head.print();
        System.out.print("After Removing Duplicates(Without buffer): ");
        removeDuplicateWithBuffer(head);
        head.print();

    }
}
