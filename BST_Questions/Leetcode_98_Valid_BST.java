package BST_Questions;

public class Leetcode_98_Valid_BST {
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
        public boolean isValidBST(TreeNode root) {
            return validbst(root).isBst;
        }

        public BstPair validbst(TreeNode root) {
            if (root == null) {
                return new BstPair();
            }
            BstPair left_bst_pair = validbst(root.left);
            BstPair right_bst_pair = validbst(root.right);

            BstPair self_bst_pair = new BstPair();

            self_bst_pair.min = Math.min(root.val, Math.min(left_bst_pair.min, right_bst_pair.min));
            self_bst_pair.max = Math.max(root.val, Math.max(left_bst_pair.max, right_bst_pair.max));

            self_bst_pair.isBst=left_bst_pair.isBst && right_bst_pair.isBst && root.val>left_bst_pair.max && root.val<right_bst_pair.min;
            return self_bst_pair;

        }
    }

    class BstPair {
        boolean isBst=true;
        Long min = Long.MAX_VALUE;
        Long max = Long.MIN_VALUE;
    }
}
