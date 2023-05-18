package org.example.Fundamental.Search_in_a_Binary_Search_Tree;

public class Main {
    public static void main(String[] args) {
        TreeNode second = TreeNodeUtils.treeNodeFromStringArray("[18,2,22,null,null,null,63,null,84,null,null]");
        System.out.println(SearchBinarySearchTree.searchBST(second,63));
    }
}
