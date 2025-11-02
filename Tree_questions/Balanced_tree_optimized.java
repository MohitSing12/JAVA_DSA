package Tree_questions;

public class Balanced_tree_optimized {
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
        public boolean isBalanced(TreeNode root){
           return Balanced(root).isbal;
        }
        public Bal_pair Balanced(TreeNode root) {
            if (root == null) {
                return new Bal_pair();
            }
            Bal_pair lbp= Balanced(root.left);
            Bal_pair rbp= Balanced(root.right);
            Bal_pair sbp = new Bal_pair();

            sbp.ht=Math.max(lbp.ht,rbp.ht)+1;

            boolean sb=Math.abs(lbp.ht-rbp.ht)<=1;

            sbp.isbal=lbp.isbal && rbp.isbal && sb;


            return sbp;
        }

        class Bal_pair {
            boolean isbal = true;
            int ht = -1;
        }
    }
}