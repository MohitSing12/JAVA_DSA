public class Max_Subarr_kaden_algo {
    public static void main(String[] args) {
        int[] arr = {2, 3, -7, 11, -1, 3};
        System.out.println(max(arr));
    }

    public static int max(int[] arr) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            ans = Math.max(sum, ans);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}
