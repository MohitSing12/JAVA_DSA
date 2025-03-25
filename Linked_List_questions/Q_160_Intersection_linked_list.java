package Linked_List_questions;

public class Q_160_Intersection_linked_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode B = headB;
            ListNode A = headA;
            while (A != B) {
                if (A == null) {
                    A = headB;
                } else {
                    A = A.next;
                }

                if (B == null) {
                    B = headA;
                } else {
                    B = B.next;
                }

            }
            return A;
        }
    }
}
