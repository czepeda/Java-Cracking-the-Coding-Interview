
class Node {

    String data;
    Node next = null;

    public Node(String d) {
        data = d;

    }

    public void appendToTail(String d) {

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
