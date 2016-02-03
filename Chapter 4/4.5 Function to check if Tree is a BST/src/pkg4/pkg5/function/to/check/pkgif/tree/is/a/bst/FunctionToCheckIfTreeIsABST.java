package pkg4.pkg5.function.to.check.pkgif.tree.is.a.bst;

/**
 * Implement a function to check if a binary tree is a binary search tree. More
 * precisely, the condition is that ALL left nodes must be less than or equal to
 * the current node, which must be less than ALL the right nodes (for all
 * nodes).
 */
public class FunctionToCheckIfTreeIsABST {

    public static boolean checkBST(TreeNode n) {
        return checkBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean checkBST(TreeNode n, int min, int max) {
        if (n == null) {
            return true;
        }

        if (n.value <= min || n.value > max) {
            return false;
        }
        if (!checkBST(n.left, min, n.value) || !checkBST(n.right, n.value, max)) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        /*
         *     4
         *    / \
         *   2   5
         *  / \
         * 1   3
         */
        TreeNode n1 = new TreeNode(2), n2 = new TreeNode(3), r = new TreeNode(4);
        n1.left = new TreeNode(1);
        n1.right = n2;
        r.left = n1;
        r.right = new TreeNode(5);
        //TreeNode.printTree(r);
        //System.out.println("isBSTNaive: " + isBSTNaive(r));
        System.out.println("isBST:      " + checkBST(r));
        //System.out.println("isBSTWrong: " + isBSTWrong(r));
        System.out.println();
        /*
         *   2
         *  / \
         * 1   4
         *  \
         *   3
         */
        n1 = new TreeNode(1);
        n1.right = new TreeNode(3);
        r = new TreeNode(2);
        r.left = n1;
        r.right = new TreeNode(4);
        //TreeNode.printTree(r);
        //System.out.println("isBSTNaive: " + isBSTNaive(r));
        System.out.println("isBST:      " + checkBST(r));
        //System.out.println("isBSTWrong: " + isBSTWrong(r));
    }
}
