package org.example.Fundamental.Binary_Tree_Paths;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> strings = new ArrayList<>();
        String string = String.valueOf(root.val);
        if (root.left != null) {
            binaryTreePaths(root.left, strings, string);
        }
        if (root.right != null) {
            binaryTreePaths(root.right, strings, string);
        }
        if (root.left == null && root.right == null) {
            strings.add(string);
        }
        return strings;
    }

    public static void binaryTreePaths(TreeNode root, List<String> strings, String string) {
        string += "->";
        string += String.valueOf(root.val);
        if (root.left != null) {
            binaryTreePaths(root.left, strings, string);
        }
        if (root.right != null) {
            binaryTreePaths(root.right, strings, string);
        }
        if (root.left == null && root.right == null) {
            strings.add(string);
        }
    }
}
