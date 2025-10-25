package Tree_questions;

public class Leetcode_129 {
    public class TreeNode {
        int val;
        Leetcode_129.TreeNode left;
        Leetcode_129.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Leetcode_129.TreeNode left, Leetcode_129.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class solution{
        public int sumNumbers(TreeNode root){
            return sum(root,0);
        }
        private int sum(TreeNode root,int num){
            if(root==null){
                return 0;
            }
            if(root.left==null && root.right==null){
                return num*10+root.val;
            }

            int left=sum(root.left,num*10+root.val);
            int right=sum(root.right,num*10+root.val);
            return left+right;
        }
    }
}
