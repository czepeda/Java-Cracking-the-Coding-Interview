
class Node {

    int data;
    Node next = null;

    public Node(int d) {
        data = d;

    }

    public void appendToTail(int d) {

        Node end = new Node(d);
        Node n = this;
        

        while (n.next != null) {
            n = n.next;
        }
        n.next = end;

    }

    void print() {
        Node n = this;
        //
        //System.out.println(n.next.next);
        System.out.print("Linked List: ");
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

}
