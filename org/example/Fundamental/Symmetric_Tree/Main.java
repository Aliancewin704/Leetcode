package org.example.Fundamental.Symmetric_Tree;

public class Main {

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, node3, node4);
        TreeNode node2rev = new TreeNode(2, node4, node3);
        TreeNode nodeFather = new TreeNode(1, node2, node2rev);
        System.out.println(SymmetricTree.search(nodeFather));
    }
}
