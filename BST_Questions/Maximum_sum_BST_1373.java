package BST_Questions;

public class Maximum_sum_BST_1373 {
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
        public int Maximum_sum_BST_1373(TreeNode root) {
            return validBST(root).ans;
        }

        public BstPair validBST(TreeNode root) {
            if (root == null) {
                return new BstPair();
            }
            BstPair lbstp = validBST(root.left);
            BstPair rbstp = validBST(root.right);
            BstPair sbstp = new BstPair();
            sbstp.min = Math.min(root.val, Math.min(lbstp.min, rbstp.min));
            sbstp.max = Math.max(root.val, Math.max(lbstp.max, rbstp.max));
            sbstp.isBst = lbstp.isBst && rbstp.isBst && root.val > lbstp.max && root.val < rbstp.min;
            sbstp.sum = lbstp.sum + rbstp.sum + root.val;
            if (sbstp.isBst) {
                sbstp.ans = Math.max(sbstp.sum, Math.max(lbstp.ans, rbstp.ans));
            } else {
                sbstp.ans = Math.max(lbstp.ans, rbstp.ans);
            }
            return sbstp;
        }

    }

    class BstPair {
        boolean isBst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        int sum = 0;
        int ans = 0;
    }

}
