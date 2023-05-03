package org.example.Fundamental.Merge_Two_Binary_Trees;


public class MergeTwoBinaryTrees {


    public static TreeNode mergeTrees(TreeNode first, TreeNode second) {
        TreeNode ans = new TreeNode();
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        ans.val = first.val + second.val;
        return checkingTree(first, second, ans);
    }

    public static TreeNode checkingTree(TreeNode first, TreeNode second, TreeNode ans) {
        if (first.left != null && second.left != null) {
            ans.left = new TreeNode(first.left.val + second.left.val);
            checkingTree(first.left, second.left, ans.left);
        } else if (first.left == null) {
            ans.left = second.left;
        } else {
            ans.left = first.left;
        }
        if (first.right != null && second.right != null) {
            ans.right = new TreeNode(first.right.val + second.right.val);
            checkingTree(first.right, second.right, ans.right);
        } else if (first.right == null) {
            ans.right = second.right;
        } else {
            ans.right = first.right;
        }
        return ans;
    }
}
