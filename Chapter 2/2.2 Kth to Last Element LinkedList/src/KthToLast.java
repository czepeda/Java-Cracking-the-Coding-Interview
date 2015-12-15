
class KthToLast {

    /*public static int Recursive(Node head, int k) {
     if (head == null) {
     return 0;
     }

     int i = Recursive(head.next, k) + 1;

     if (i == k) {
     System.out.println("Kth to last Node: " + head.data);
     }

     return i;

     }*/
    public static void main(String[] args) throws java.lang.Exception {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(6);
        head.print();

        //Recursive(head, 2);
        Iterative(head, 2);

    }

    public static void Iterative(Node head, int k) {

        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < k - 1; i++) {
            p1 = p1.next;

        }

        while (p1 != null && p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;

        }

        System.out.println("Kth to last Node: " + p2.data);
    }
}
