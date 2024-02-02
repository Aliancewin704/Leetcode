package org.example.Fundamental.Two_Sum_IV_Input_is_a_BST;


public class Main {

    public static void main(String[] args) {
        TreeNode first = TreeNodeUtils.treeNodeFromStringArray("[5,3,6,2,4,null,7]");
        System.out.println(TwoSumIVInputIsABST.findTarget(first, 9));
    }
}
