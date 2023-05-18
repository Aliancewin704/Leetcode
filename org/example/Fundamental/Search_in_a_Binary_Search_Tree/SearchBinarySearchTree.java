package org.example.Fundamental.Search_in_a_Binary_Search_Tree;

public class SearchBinarySearchTree {
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root.val == val) return root;
        if (root.val < val && root.right != null) return searchBST(root.right, val);
        if (root.val > val && root.left != null) return searchBST(root.left, val);
        return null;
    }
}
