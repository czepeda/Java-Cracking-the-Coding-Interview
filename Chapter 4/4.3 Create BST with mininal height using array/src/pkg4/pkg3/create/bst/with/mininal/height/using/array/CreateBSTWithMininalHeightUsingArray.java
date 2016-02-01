/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg3.create.bst.with.mininal.height.using.array;

/**
 *
 * @author czepeda
 */
/**
 * Given a sorted (increasing order) array with unique integer elements, write
 * an algorithm to create a binary search tree with minimal height.
 */
public class CreateBSTWithMininalHeightUsingArray {

    public static TreeNode createBST(int[] a) {
        if (a == null) {
            return null;
        }
        return createMinimalBST(a, 0, a.length - 1);
    }

    private static TreeNode createMinimalBST(int[] a, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(a[mid]);
        n.left = createMinimalBST(a, start, mid - 1);
        n.right = createMinimalBST(a, mid + 1, end);
        return n;

    }

    //TEST----------------------------------
    public static void main(String[] args) {
        TreeNode.printTree(createBST(new int[]{}));
        System.out.println();
        TreeNode.printTree(createBST(new int[]{0}));
        System.out.println();
        TreeNode.printTree(createBST(new int[]{0, 1}));
        System.out.println();
        TreeNode.printTree(createBST(new int[]{0, 1, 2, 3, 4}));
        System.out.println();
        TreeNode.printTree(createBST(new int[]{-1, 0, 1, 3, 4, 7, 9}));
        System.out.println();
    }
}
