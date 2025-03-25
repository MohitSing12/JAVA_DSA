package Linked_List.src;

public class LinkedList_client {
    public static void main(String[] args) throws Exception {
        LinkedList ll=new LinkedList();
        ll.addfirst(10);

        ll.addfirst(20);
        ll.display();
        ll.addAtIndex(40,1);
        ll.display();
        System.out.println(ll.removeAtIndex(2));
        ll.display();


    }
}
