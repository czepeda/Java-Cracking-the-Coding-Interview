package pkg4.pkg1.check.pkgif.binary.tree.is.balanced;

import java.util.Stack;

public class CheckIfBinaryTreeIsBalanced {

    public static boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        int heightDiff = getHeight(root.left) - getHeight(root.right);

        if (Math.abs(heightDiff) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public static boolean isBalanced2(TreeNode root) {
        if (checkHeight(root) == -1) {
            return false;
        } else {
            return true;
        }

    }

    private static int getHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;

    }

    public static int checkHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        int heightDifference = leftHeight - rightHeight;

        if (Math.abs(heightDifference) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }

    }

    public static void main(String[] args) {
        /*
         *     4
         *    / \
         *   1   5
         *  / \
         * 2   3
         *
         */
        /* TreeNode n1 = new TreeNode(1), n2 = new TreeNode(3), r = new TreeNode(4);
         n1.left = new TreeNode(2);
         n1.right = n2;
         r.left = n1;
         r.right = new TreeNode(5);
         n2.left = new TreeNode(44);
         n2.right = new TreeNode(55);*/
        TreeNode r = new TreeNode(40);

        TreeNode L1 = new TreeNode(20);

        TreeNode R1 = new TreeNode(60);
        r.left = L1;
        r.right = R1;

        L1.left = new TreeNode(10);
        L1.right = new TreeNode(30);
        R1.left = new TreeNode(50);
        R1.right = new TreeNode(70);

        //TreeNode.printTree(r);
        //System.out.print(isBalanced(r) + " ");
        //System.out.print(isBalanced2(r) + " ");
        inOrderTraversal(r);
        System.out.println("");
        preOrderTraversal(r);
        System.out.println("");
        postOrderTraversal(r);

    }

    public static void inOrderTraversal(TreeNode root) {

        System.out.print("InOrder Traversal: ");
        if (root == null) {
            return;
        }

        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode currentNode = root;

        while (!s.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                s.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode n = s.pop();
                System.out.printf("%d ", n.value);
                currentNode = n.right;
            }
        }

    }

    public static void preOrderTraversal(TreeNode root) {
        System.out.print("PreOrder Traversal: ");

        if (root == null) {
            return;
        }

        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);

        while (!s.isEmpty()) {
            TreeNode n = s.pop();
            System.out.printf("%d ", n.value);
            if (n.right != null) {
                s.push(n.right);
            }

            if (n.left != null) {
                s.push(n.left);
            }

        }

    }

    public static void postOrderTraversal(TreeNode root) {
        System.out.print("PostOrder Traversal: ");
        if (root == null) {
            return;
        }

        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode current = root;

        while (true) {

            if (current != null) {
                if (current.right != null) {
                    s.push(current.right);
                }
                s.push(current);
                current = current.left;
                continue;
            }

            if (s.isEmpty()) {
                return;
            }

            current = s.pop();

            if (current.right != null & !s.isEmpty() && current.right == s.peek()) {
                s.pop();
                s.push(current);
                current = current.right;
            } else {
                System.out.print(current.value + " ");
                current = null;
            }

        }

    }

}
