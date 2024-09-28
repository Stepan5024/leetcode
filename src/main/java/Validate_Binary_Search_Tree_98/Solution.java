package Validate_Binary_Search_Tree_98;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5L);
        root.left = new TreeNode(1L);
        root.right = new TreeNode(4L);
        root.right.left = new TreeNode(3L);
        root.right.right = new TreeNode(6L);

        // Проверяем, является ли дерево допустимым бинарным деревом поиска (BST)
        boolean isValid = isValidBST(root);
        System.out.println("Is valid BST: " + isValid);
    }


    public static boolean isValidBST(TreeNode root) {
        return valid(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    public static boolean valid(TreeNode node, Long minimum, Long maximum ) {
        if (node == null) return true;
        if (!(node.val > minimum && node.val < maximum) ) return false;

        return valid(node.left, minimum, node.val) && valid(node.right, node.val, maximum);
    }

    public static class TreeNode {
        Long val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(Long val) {
            this.val = val;
        }

        TreeNode(Long val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
