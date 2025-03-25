import java.util.ArrayList;

public class Array_list_demo {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);
        System.out.println(ll.size());
        ll.add(2,-6);
        System.out.println(ll);
        //get
        System.out.println(ll.get(2));
        //set
        ll.set(2,90);
        System.out.println(ll);
        //remove
        ll.remove(1);
        System.out.println(ll);
        //Collections.sort() used to sort the list
//Collections.reverse() used to reverse the list
    }
}