import java.util.ArrayList;

public class merge_sorted_arr {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 5, 7, 11, 13, 17};

        ArrayList<Integer> ll = new ArrayList<>();
        merge(arr1, arr2,ll);

    }

    public static void merge(int[] arr1, int[] arr2, ArrayList<Integer> ll) {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr = new int[n + m];
        int p = 0;
        int q = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[p] < arr2[q]) {
                arr[k] = arr1[p];
                k++;
                p++;
            } else {
                arr[k] = arr2[q];
                k++;
                q++;
            }
        }
        while (p < n) {
            arr[k] = arr1[p];
            k++;
            p++;
        }
        while (q < m) {
            arr[k] = arr2[q];
            k++;
            q++;
        }
        for (int i = 0; i < arr.length; i++) {
            ll.add(arr[i]);

        }
//        System.out.print(ll);
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] == arr[i + 1]) {
                ll.remove(arr[i]);
            }

        }
        System.out.print(ll);

    }
}