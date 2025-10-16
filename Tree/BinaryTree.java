package Tree;

import java.util.*;

public class BinaryTree {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root; //root holds the reference to the starting point of the tree.
    Scanner sc = new Scanner(System.in);

    public BinaryTree() {
        //This is the constructor which will be called when the class objects calls the methods of the class
        root = CreateTree();
    }

    private Node CreateTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();//has left child
        if (hlc) {
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();//has right child
        if (hrc) {
            nn.right = CreateTree();
        }
        return nn;
    }

    //To display the values of the tree
    public void Display() {
        //As we don't have access to the
        Display(root);
    }

    private void Display(Node node) {
        if (node == null) {
            return;
        }
        String s = "";
        s = "<--" + node.val + "-->";
        if (node.left != null) {
            s = node.left.val + s;
        } else {
            s = "." + s;
        }
        if (node.right != null) {
            s = s + node.right.val;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }

    //Code to find an element in a tree
    public boolean find(int item) {
        return find(this.root, item);
    }

    private boolean find(Node nn, int item) {
        if (nn == null) {
            return false;
        }
        if (nn.val == item) {
            return true;
        }
        boolean left = find(nn.left, item);
        boolean right = find(nn.right, item);
        return left || right;
    }

    //Code to find max in a tree
    public int max() {
        return max(this.root);
    }

    public int max(Node nn) {
        if (nn == null) {
            return Integer.MIN_VALUE;
        }
        int left = max(nn.left);
        int right = max(nn.right);
        return Math.max(nn.val, Math.max(left, right));
    }

    //Code to find the height of tree
    //Height of tree=Maximum distance between root to leaf node
    //The height of a single node can be 0 or 1 and both are correct
    public int ht() {
        return ht(this.root);
    }

    public int ht(Node nn) {
        //Here we have taken the height of root node as 0 so the indexing of the tree will start from 0
        if (nn == null) {
            return -1;
        }
        int left = ht(nn.left);
        int right = ht(nn.right);
        return Math.max(left, right) + 1;
    }

    //Pre-order traversal
    //root->left->right
    public void pre_Order() {
        pre_Order(this.root);
        System.out.println();
    }

    private void pre_Order(Node nn) {
        if (nn == null) {
            return;
        }
        System.out.print(nn.val + " ");
        pre_Order(nn.left);
        pre_Order(nn.right);
    }

    //Post order traversal
    //left->right->root
    public void post_Order() {
        post_Order(this.root);
        System.out.println();
    }

    private void post_Order(Node nn) {
        if (nn == null) {
            return;
        }
        post_Order(nn.left);
        post_Order(nn.right);
        System.out.print(nn.val + " ");
    }

    //In-order Trversal
    //Here the order of traversal is left->root->right

    public void in_Order(){
        in_Order(this.root);
        System.out.println();
    }
    private void in_Order(Node nn){
        if(nn==null){
            return;
        }
        in_Order(nn.left);
        System.out.print(nn.val+" ");
        in_Order(nn.right);
    }

    //Level-order traversal
    //The order of traversal is: level(1)->level(2)->....level(n)
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
