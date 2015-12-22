
class add {

    public static void main(String[] args) throws java.lang.Exception {
        Node n1 = new Node(1);
        n1.appendToTail(0);

        Node n2 = new Node(9);
        n2.appendToTail(1);

        n1.print();
        n2.print();

        addLists(n1, n2);
    }

    /*public static Node addLists(Node n1, Node n2, int carry) {

     if (n1 == null && n2 == null && carry == 0) {
     return null;

     }

     Node result = new Node(carry);
     int value = carry;

     if (n1 != null) {
     value += n1.data;
     }

     if (n2 != null) {
     value += n2.data;
     }

     result.data = value % 10;

     if (n1 != null || n2 != null) {
     Node more = addLists(n1 == null ? null : n1.next, n2 == null ? null : n2.next, value >= 10 ? 1 : 0);
     result.next = more;
     }
     result.print();
     return result;

     }*/
    public static Node addLists(Node n1, Node n2) {

        int len1 = length(n1);
        int len2 = length(n2);

        if (len1 < len2) {
            n1 = padList(n1, len2 - len1);

        } else {
            n2 = padList(n2, len1 - len2);
        }

        PartialSum sum = addListsHelper(n1, n2);
        if (sum.carry == 0) {
            return sum.sum;
        } else {
            Node result = insertBefore(sum.sum, sum.carry);
            result.print();
            return result;
        }

    }

    public static PartialSum addListsHelper(Node n1, Node n2) {

        if (n1 == null && n2 == null) {
            return new PartialSum();
        }

        PartialSum sum = addListsHelper(n1.next, n2.next);
        int value = sum.carry + n1.data + n2.data;
        Node fullResult = insertBefore(sum.sum, value % 10);
        sum.sum = fullResult;
        sum.carry = value / 10;

        return sum;

    }

    public static Node padList(Node n, int padding) {

        Node head = n;

        for (int i = 0; i < padding; i++) {
            Node node = new Node(0);
            node.next = head;
            head = node;
        }
        return head;
    }

    public static Node insertBefore(Node n, int data) {
        Node head = new Node(data);
        if (n != null) {
            head.next = n;
        }
        return head;
    }

    public static int length(Node n) {

        if (n != null) {
            return 0;
        }
        return 1 + length(n.next);
    }

}
