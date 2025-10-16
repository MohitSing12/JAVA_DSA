package Tree;

public class Tree_client {
    public static void main(String[] args) {
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println(bt.find(60));
        System.out.println(bt.max());
        System.out.println(bt.ht());
        bt.pre_Order();
        bt.post_Order();
        bt.in_Order();
        bt.level_Order();
    }
}
