package Tree_questions;

import Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Using_level_Order {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    TreeNode root;
    Scanner sc = new Scanner(System.in);

    public Create_Tree_Using_level_Order() {
        root = buildTree();
    }

    private TreeNode buildTree() {
        int item = sc.nextInt();
        TreeNode node = new TreeNode();
        node.val = item;
        root = node;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            TreeNode rv = q.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 != -1) {
                TreeNode n = new TreeNode();
                n.val = c1;
                rv.left = n;
                q.add(n);
            }
            if (c2 != -1) {
                TreeNode n = new TreeNode();
                n.val = c2;
                rv.right = n;
                q.add(n);
            }
        }
        return root;
    }
//    public void level_Order(){
//        level_Order(this.root);
//    }
//    private void level_Order(TreeNode node){
//        Queue<TreeNode> q=new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty()){
//            TreeNode rv=q.poll(); //remove first
//            System.out.print(rv.val+" ");
//            if(rv.left!=null){
//                q.add(rv.left);
//            }
//            if(rv.right!=null){
//                q.add(rv.right);
//            }
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
        Create_Tree_Using_level_Order c1=new Create_Tree_Using_level_Order();
//        c1.level_Order();
    }
}

