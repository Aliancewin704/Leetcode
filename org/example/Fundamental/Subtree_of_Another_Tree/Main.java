package org.example.Fundamental.Subtree_of_Another_Tree;




public class Main {

    public static void main(String[] args) {
        TreeNode first = TreeNodeUtils.treeNodeFromStringArray("[3,4,5,1,2]");
        TreeNode second = TreeNodeUtils.treeNodeFromStringArray("[4,1,2]");
        System.out.println(SubtreeOfAnotherTree.isSubtree(first,second));
    }
}
