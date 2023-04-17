package org.example.Fundamental.Path_Sum;

public class PathSum {

    public static boolean hasPathSum(TreeNode treeNode, int targetSum) {
        if (treeNode == null) return false;
        return sum(treeNode, targetSum, 0);
    }


    public static boolean sum(TreeNode treeNode, int targetSum, int value) {
        if (treeNode == null) return false;
        value += treeNode.val;
        if (treeNode.left == null && treeNode.right == null) {
            if (value == targetSum) return true;
        }
        return sum(treeNode.right, targetSum, value) || sum(treeNode.left, targetSum, value);
    }
}
