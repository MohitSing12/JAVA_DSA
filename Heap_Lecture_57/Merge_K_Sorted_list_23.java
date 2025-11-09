package Heap_Lecture_57;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_K_Sorted_list_23 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode mergeKList(ListNode[] lists){
      PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>() {
          @Override
          public int compare(ListNode o1, ListNode o2) {
              //Here we will do o1.val-o2.val bcz its min heap and
              // implementation of this is different from the heap
              return o1.val-o2.val;
          }
      });
      for(int i=0;i< lists.length;i++){
          if(lists[i]!=null){
              pq.add(lists[i]);
          }
      }

      ListNode dummy=new ListNode();
      ListNode temp=dummy;
      while(!pq.isEmpty()){
          ListNode rv=pq.poll();
          dummy.next=rv;
          dummy=dummy.next;
          if(rv.next!=null){
              pq.add(rv.next);
          }
      }
      return temp.next;
  }
}
