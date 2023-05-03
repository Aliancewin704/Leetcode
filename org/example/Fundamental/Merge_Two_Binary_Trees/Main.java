package org.example.Fundamental.Merge_Two_Binary_Trees;

import static org.example.Fundamental.Merge_Two_Binary_Trees.TreeNodeUtils.treeNodeFromStringArray;
import static org.example.Fundamental.Merge_Two_Binary_Trees.MergeTwoBinaryTrees.mergeTrees;

public class Main {

    public static void main(String[] args) {
        TreeNode first = treeNodeFromStringArray("[1,3,2,5]");
        TreeNode second = treeNodeFromStringArray("[2,1,3,null,4,null,7]");
        mergeTrees(first,second);
    }
}
