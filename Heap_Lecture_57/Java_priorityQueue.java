package Heap_Lecture_57;

//Collections is an interface in java
import java.util.Collections;
import java.util.PriorityQueue;

public class Java_priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(); //Min heap
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder()); //Max heap

    }
}
