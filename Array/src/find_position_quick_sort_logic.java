public class find_position_quick_sort_logic {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 3, 8, 1, 4};
         int idx= partition(arr, 0, arr.length - 1);
//        System.out.println(arr[idx]);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int partition(int[] arr, int si, int ei) {
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
        int temp=arr[ei];
        arr[ei]=arr[idx];
        arr[idx]=temp;
        return idx;
    }
}
