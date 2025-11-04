package BST_Questions;

public class Leetcode_333_Largest_BST_In_A_Subtree {
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
    class Solution{
        public int largestBSTSubtree(TreeNode root){
            return validBST(root).size;
        }
        public BstPair validBST(TreeNode root){
            if(root==null){
                return new BstPair();
            }
            BstPair lbstp=validBST(root.left);
            BstPair rbstp=validBST(root.right);
            BstPair sbstp=new BstPair();
            sbstp.min=Math.min(root.val,Math.min(lbstp.min,rbstp.min));
            sbstp.max=Math.max(root.val,Math.max(lbstp.max,rbstp.max));
            sbstp.isBst=lbstp.isBst && rbstp.isBst && root.val>lbstp.max && root.val<rbstp.min;
            if(sbstp.isBst){
                sbstp.size=lbstp.size+rbstp.size+1;
            }
            else{
                sbstp.size=Math.max(lbstp.size,rbstp.size);
            }
            return sbstp;
        }

    }
    class BstPair{
        boolean isBst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        int size=0;
    }

}
