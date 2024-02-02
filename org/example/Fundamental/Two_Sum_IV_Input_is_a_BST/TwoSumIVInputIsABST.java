package org.example.Fundamental.Two_Sum_IV_Input_is_a_BST;


import java.util.HashSet;
import java.util.Set;

public class TwoSumIVInputIsABST {

    public static boolean findTarget(TreeNode root, int k) {
        Set<Integer> dictionary = new HashSet<>();
        return twoSum(root, dictionary, k);
    }

    public static boolean twoSum(TreeNode n, Set<Integer> dictionary, int k) {
        if (n == null) return false;
        if (dictionary.contains(k - n.val)) return true;
        dictionary.add(n.val);
        return twoSum(n.left, dictionary, k) || twoSum(n.right, dictionary, k);
    }
}
