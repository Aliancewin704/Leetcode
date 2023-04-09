package org.example.Fundamental.Symmetric_Tree;

public class SymmetricTree {
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node2 = new TreeNode(2, node3, node4);
    TreeNode node2rev = new TreeNode(2, node4, node3);
    TreeNode nodeFather = new TreeNode(1, node2, node2rev);


    public static boolean search(TreeNode nodeFather) {
        if (nodeFather == null) return true;
        return comparison(nodeFather.left,nodeFather.right);
    }

    public static boolean comparison(TreeNode left, TreeNode right){
        if (left == null & right != null) return false;
        if (right == null & left != null) return false;
        if (right == left) return true;
        if (left.val == right.val) return comparison(left.left, right.right) && comparison(left.right, right.left);
        return false;
    }
}
