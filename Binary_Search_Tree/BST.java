package Binary_Search_Tree;



import java.util.LinkedList;
import java.util.Queue;

public class BST {
    public class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;

    public BST(int[] in) {
        root = CreateTree(in, 0, in.length - 1);
    }

    private Node CreateTree(int[] in, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node nn = new Node();
        nn.val = in[mid];
        nn.left = CreateTree(in, si, mid - 1);
        nn.right = CreateTree(in, mid + 1, ei);
        return nn;
    }

    //The time complexity to to find max element in bst is O(log n) bcz we are discarding one side of the tree.
    public int max(){
        return max(this.root);
    }
    private int max(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int right=max(node.right);
        return Math.max(node.val,right);

    }

    public boolean find(int item){
        return find(this.root,item);
    }
    private boolean find(Node nn,int item){
        if(nn==null){
            return false;
        }
        if(nn.val==item){
            return true;
        }
        else if(nn.val>item){
            return find(nn.left,item);
        }
        else{
            return find(nn.right,item);
        }
    }

    public void level_Order(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv=q.poll(); //remove first
            System.out.print(rv.val+" ");
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                q.add(rv.right);
            }
        }
        System.out.println();
    }
}
