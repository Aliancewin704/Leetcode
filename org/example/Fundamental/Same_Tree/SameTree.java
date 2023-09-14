package org.example.Fundamental.Same_Tree;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) return false;
        return recurtionSameTree(p,q);
    }

    public boolean recurtionSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p.val != q.val) return false;
        if ((p.left == null && q.left != null) || (p.left != null && q.left == null)) return false;
        if ((p.right == null && q.right != null) || (p.right != null && q.right == null)) return false;
        return recurtionSameTree(p.left,q.left) && recurtionSameTree(p.right,q.right);
    }
}
