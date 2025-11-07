package Heap_Lecture_57;

import java.util.PriorityQueue;

public class Kth_largest_element_215 {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        int k=3;
        System.out.println(kthLargest(arr,k));
    }
    public static int kthLargest(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);

        }
        for(int j=k;j<arr.length;j++){
            if(arr[j]>pq.peek()){
                pq.poll();
                pq.add(arr[j]);
            }
        }
        return pq.peek();
    }
}
