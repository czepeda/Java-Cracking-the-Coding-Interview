/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg6.in.order.find.next.node.in.bst;

/**
 *
 * @author czepeda
 */
public class InOrderFindNextNodeInBST {

    public static TreeNode inorderSuccessor(TreeNode n) {
        if (n == null) {
            return null;
        }

        if (n.right != null) {
            return leftmostChild(n.right);
        }

        if (n.parent != null && n.parent.right == n) {
            n = n.parent;
        }

        return n.parent;
    }

    private static TreeNode leftmostChild(TreeNode n) {

        if (n.right == null) {
            return n;
        }

        return leftmostChild(n.left);
    }

    public static void main(String[] args) {
        /*
         *     4
         *    / \
         *   2   5
         *  / \
         * 1   3
         */
        TreeNode n1 = new TreeNode(1), n2 = new TreeNode(2), n3 = new TreeNode(3),
                n4 = new TreeNode(4), n5 = new TreeNode(5);
        n2.left = n1;
        n2.right = n3;
        n1.parent = n2;
        n3.parent = n2;
        n4.left = n2;
        n4.right = n5;
        n2.parent = n4;
        n5.parent = n4;
        //TreeNode.printTree(n4);

        TreeNode n = n1;
        System.out.print("In-order: ");
        while (n != null) {
            System.out.print(n + " ");
            n = inorderSuccessor(n);
        }

    }
}
