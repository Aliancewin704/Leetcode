package org.example.Intermediate.Validate_Binary_Search_Tree;

public class ValidateBinarySearchTree {
    public static boolean isValidBST(TreeNode root) {
        long min = -2147483649L;
        long max = 2147483649L;
        if (root == null) {
            return true;
        }
        return isValid(root.left,min,root.val) && isValid(root.right,root.val,max);
    }


    public static boolean isValid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}
