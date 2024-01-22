package org.example.Fundamental.Binary_Tree_Paths;


public class Main {

    public static void main(String[] args) {
        TreeNode first = TreeNodeUtils.treeNodeFromStringArray("[1,2,3,null,5]");
        System.out.println(BinaryTreePaths.binaryTreePaths(first));
    }
}
