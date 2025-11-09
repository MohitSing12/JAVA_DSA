package Lecture_59;

import java.util.ArrayList;
import java.util.Comparator;

public class Generic_Heap<T extends Comparable<T>> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
        upheapify(list.size() - 1);
    }

    public void upheapify(int ci) {
        int pi = (ci - 1) / 2;
        if (islarger(list.get(ci),list.get(pi))>0 ) {
            Swap(ci, pi);
            //ci=pi
            upheapify(pi);
        }
    }

    public void Swap(int i, int j) {
        T ith = list.get(i);
        T jth = list.get(j);
        list.set(i, jth);
        list.set(j, ith);
    }

    public T remove() {
        Swap(0, list.size() - 1);
        T rv = list.remove(list.size() - 1);
        downHeapify(0);
        return rv;
    }

    private void downHeapify(int pi) {
        int lci = 2 * pi + 1; //left child
        int rci = 2 * pi + 2; //right child
        int mini = pi;
        if (lci<list.size() && islarger(list.get(lci) , list.get(mini))>0) {
            mini = lci;
        }
        if (rci<list.size() && islarger(list.get(rci) , list.get(mini))>0) {
            mini = rci;
        }
        if (mini != pi) {
            Swap(mini, pi);
            downHeapify(mini);
        }
    }
    //To calculate the size
    public int size() {
        return list.size();
    }

    public T min() {
        return list.get(0);
    }
    public void display(){
        System.out.println(list);
    }
public int islarger(T o1,T o2){
        return o1.compareTo(o2);
}
}

