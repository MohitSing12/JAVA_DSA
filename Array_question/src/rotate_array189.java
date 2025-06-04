package Array_question.src;

public class rotate_array189 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 8;
        rotate(arr, k);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        //Loop to rotate the array k times.
        for (int j = 1; j <= k; j++) {
            int last_element = arr[n - 1];
            //Loop to rotate the array one time
            for (int i = n - 2; i >= 0; i--) {

                arr[i + 1] = arr[i];
            }
            arr[0]=last_element;
        }

    }

}
