package Array_question.src;
public class Rain_water_traping_42 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(Water_traping(arr));
    }

    public static int Water_traping(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        //left array=[0,1,1,2,2,2,2,3,3,3,3,3]
        int[] right = new int[n];
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        //right array=[3,3,3,3,3,3,3,3,2,2,2,1]
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.min(left[i], right[i])-arr[i];
        }
        return sum;
    }
}
