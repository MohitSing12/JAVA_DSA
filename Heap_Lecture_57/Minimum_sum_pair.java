package Heap_Lecture_57;

import java.util.PriorityQueue;
import java.util.Scanner;

//Coding blocks question-2698
public class Minimum_sum_pair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr=new int[k];

            for(int i=0;i<k;i++){
                arr[i]=sc.nextInt();
            }

        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            sum+=a+b;
            pq.add(a+b);

        }
        System.out.println(sum);
    }
}
