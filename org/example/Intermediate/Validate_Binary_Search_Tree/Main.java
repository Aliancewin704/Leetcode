package org.example.Intermediate.Validate_Binary_Search_Tree;


public class Main {
    public static void main(String[] args) {
        TreeNode second = TreeNodeUtils.treeNodeFromStringArray("[-2147483648,null,2147483647]");
        System.out.println(ValidateBinarySearchTree.isValidBST(second));
    }
}
