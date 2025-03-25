package QUEUE.src;

public class Queue {
    private int[] arr;
    public int front = 0;
    public int size = 0;

    public Queue() {
        arr = new int[5];
    }

    public Queue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length - 1;
    }

    public void enqueue(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Full hai bhai!");
        }
        int idx = (front + size) % arr.length;
        arr[idx] = item;
        size++;

    }

    public int dequeue() throws Exception {

        if(isEmpty()){
            throw new Exception("Khali hai");
        }
        int rv = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return rv;
    }

    public int getfront() throws Exception {
        if(isEmpty()){
            throw new Exception("Khali hai");
        }
        int rv = arr[front];
        return rv;
    }
    public void display(){
        for (int i=0;i<size;i++){
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
    }
}
