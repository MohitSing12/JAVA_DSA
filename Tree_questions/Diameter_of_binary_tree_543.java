package Tree_questions;

//Here in this question we need to output the length of the longest diameter in the tree!!
public class Diameter_of_binary_tree_543 {
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
    }

    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            int ld = diameterOfBinaryTree(root.left);//left diameter
            System.out.println(ld);
            int rd = diameterOfBinaryTree(root.right);//Right diameter
            int sd = ht(root.left) + ht(root.right) + 2;//self calculated diameter
            return Math.max(rd, Math.max(ld, sd));
        }

        private int ht(TreeNode root) {
            if (root == null) {
                return -1;
            }
            int lh = ht(root.left);
            int rh = ht(root.right);
            return Math.max(lh, rh) + 1;
        }
    }
}
