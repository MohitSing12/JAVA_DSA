import java.util.*;
public class Random_quick_sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 11, 4};
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int idx = partition(arr, si, ei);
        sort(arr, si, idx - 1);
        sort(arr, idx + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        //Hum yaha par random index ko last element se swap karenge
        RandomIndexSwap(arr,si,ei);
        int item = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] <= item) {
                //swap arr[idx] and arr[i]
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;

            }

        }
        //swap arr[ei] and arr[idx]
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
    public static void RandomIndexSwap(int[] arr,int si,int ei){
        Random rand=new Random();
        int rn=rand.nextInt(ei-si+1)+si;
        //swap rn and ei
        int temp=arr[rn];
        arr[rn]=arr[ei];
        arr[ei]=temp;
    }
}
