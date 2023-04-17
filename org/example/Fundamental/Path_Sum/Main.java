package org.example.Fundamental.Path_Sum;

public class Main {
    public static void main(String[] args) {


        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(2);

        TreeNode node6 = new TreeNode(13);

        TreeNode node8 = new TreeNode(1);
        TreeNode node7 = new TreeNode(4,node8,null);
        TreeNode node5 = new TreeNode(8,node6,node7);
        TreeNode node2 = new TreeNode(11,node3,node4);
        TreeNode node1 = new TreeNode(4,node2,null);
        TreeNode nodeFather = new TreeNode(5,node1,node5);
//
        TreeNode node41 = new TreeNode(2);

        TreeNode node81 = new TreeNode(1,node41,null);
        System.out.println(PathSum.hasPathSum(nodeFather,22));
    }
}
