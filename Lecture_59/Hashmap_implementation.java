package Lecture_59;

public class Hashmap_implementation {
    public class Node {
        String key;
        Integer value;
        Node next;
    }

    private Node[] bucket;
    private int size;

    public Hashmap_implementation(int n) {
        bucket = new Node[n];
    }

    public Hashmap_implementation() {
        this(4);
    }

    public void put(String key, Integer value) {
        int bn = hashfun(key);
        Node temp = bucket[bn];
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        Node nn = new Node();
        nn.key = key;
        nn.value = value;
        nn.next = bucket[bn];
        bucket[bn] = nn;
        size++;
        double thf = 2.0;//threshold
        double lf = (1.0 * size) / bucket.length;//load factor
        if (lf > thf) {
            rehashing();
        }
    }

    public void rehashing() {
        Node[] newBucket = new Node[2 * bucket.length];
        Node[] a = bucket;
        bucket = newBucket;
        size = 0;
        for (Node temp : a) {
            while (temp != null) {
                put(temp.key, temp.value);
                temp = temp.next;
            }
        }
    }

    public Integer get(String key){
        int bn=hashfun(key);
        Node temp=bucket[bn];
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp=temp.next;
        }
        return null;
    }

    public boolean containsKey(String key){
        int bn=hashfun(key);
        Node temp=bucket[bn];
        while(temp!=null){
            if(temp.key.equals(key)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public Integer remove(String key) {
        int bn = hashfun(key);
        Node curr = bucket[bn];
        Node prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return null;
        }
        if (prev == null) {
            bucket[bn]=curr.next;
            curr.next=null;
        }
        else{
            prev.next=curr.next;
            curr.next=null;
        }
        size--;
        return curr.value;
    }


    public int hashfun(String key) {
        int idx = key.hashCode() % bucket.length;
        if (idx < 0) {
            idx += bucket.length;
        }
        return idx;
    }
    @Override
    public String toString(){
        String s="{";
        for(Node temp:bucket){
            while(temp!=null){
                s=s+temp.key+"="+temp.value+", ";
                temp=temp.next;
            }
        }

        return s+"}";
    }
}
