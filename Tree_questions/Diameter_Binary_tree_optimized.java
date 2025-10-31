package Tree_questions;

public class Diameter_Binary_tree_optimized {
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
            DiaPair ans = diameter(root);
            return ans.dt;
            //Alternatively we can also write: return diameter(root).dt;

        }

        //Here below public DiaPair means we return an object
        public DiaPair diameter(TreeNode root) {
            if (root == null) {
                return new DiaPair();
            }
            DiaPair ldp = diameter(root.left);
            DiaPair rdp = diameter(root.right);
            DiaPair sdp = new DiaPair();
            int sd = ldp.ht + rdp.ht + 2;
            sdp.dt = Math.max(sd, Math.max(ldp.dt, rdp.dt));
            sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
            return sdp;
        }

        class DiaPair {
            int dt = 0;
            int ht = -1;
        }
    }
}
