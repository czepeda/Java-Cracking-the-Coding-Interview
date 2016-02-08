/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg6.in.order.find.next.node.in.bst;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author czepeda
 */
public class TreeNode {

    TreeNode left, right, parent;
    int value;

    public TreeNode(int x) {
        value = x;
    }

    public String toString() {
        return String.valueOf(value);
    }

    public static void printTree(TreeNode n) {
        if (n == null) {
            return;
        }
        System.out.println(n.value);
        printTree(n.left, 0, true);
        printTree(n.right, 0, false);
    }

    private static void printTree(TreeNode n, int level, boolean isLeft) {
        if (n == null) {
            return;
        }
        for (int i = 0; i < level; ++i) {
            System.out.print("  ");
        }
        if (isLeft) {
            System.out.println("/L- " + n.value);
        } else {
            System.out.println("\\R- " + n.value);
        }
        printTree(n.left, level + 1, true);
        printTree(n.right, level + 1, false);
    }
}
