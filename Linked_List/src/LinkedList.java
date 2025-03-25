package Linked_List.src;

public class LinkedList {

    public class Node {
        int val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    //O(1)
    public void addfirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }

    }

    //O(1)
    public void addlast(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            addfirst(item);

        } else {
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    //O(N)
    public void addAtIndex(int item, int k) throws Exception {
        if (k == 0) {
            addfirst(item);
        } else if (k == size) {
            addlast(item);
        } else {
            Node k_1th = GetNode(k - 1);
            Node nn = new Node();
            nn.val = item;
            nn.next = k_1th.next;
            k_1th.next = nn;
            size++;
        }
        if (k < 0 || k >= size) {
            throw new Exception("out of range hai!!");
        }
    }

    private Node GetNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("out of range hai!!");
        }
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println(".");
    }

    //O(1)
    public int getFirst() {
        return head.val;
    }

    //O(1)
    public int getLast() {
        return tail.val;
    }

    //O(N)
    public int getAtIndex(int k) throws Exception {
        return GetNode(k).val;
    }

    //O(1)
    public int removeFirst() {
        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            temp.next = null;

        }
        size--;
        return temp.val;
    }

    public int removeLast() throws Exception {
        if (size == 1) {
            return removeFirst();
        } else {
            Node prev = GetNode(size - 2);
            Node temp = tail;
            tail = prev;
            tail.next = null;
            size--;
            return temp.val;
        }
    }

    public int removeAtIndex(int k) throws Exception{
        if(k==0){
           return removeFirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else{
            Node prev=GetNode(k-1);
            Node curr=prev.next; //GetNode(k)
            prev.next=curr.next;
            curr.next=null;
            size--;
            return curr.val;
        }
    }
}
