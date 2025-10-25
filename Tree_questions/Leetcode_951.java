package Tree_questions;

public class Leetcode_951 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        class Solution {
            public static boolean flipEqui(TreeNode root1, TreeNode root2) {
                return check_Equi(root1, root2);
            }

            private static boolean check_Equi(TreeNode root_1, TreeNode root_2) {
                if (root_1 == null && root_2 == null) {
                    return true;
                }
                if (root_1 == null || root_2 == null) {
                    return false;
                }
                //If we want to check if the structure of two trees is same then,
                //we will not use the below condition
                if (root_1.val != root_2.val) {
                    return false;
                }
                boolean flip = check_Equi(root_1.left, root_2.right) && check_Equi(root_1.right, root_2.left);
                boolean no_flip = check_Equi(root_1.left, root_2.left) && check_Equi(root_1.right, root_2.left);
                return flip || no_flip;
            }
        }
    }
}
