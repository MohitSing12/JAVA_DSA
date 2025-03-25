public class Ques_713_subarr_sum_less_than_k {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,2};
        int k=10;
        System.out.println( numSubarrayProductLessThanK(arr,  k));

    }
    public static int numSubarrayProductLessThanK(int[]arr, int k) {
        if (k <= 1) return 0; // Since all numbers are positive, if k <= 1, no subarray will satisfy the condition
        int start=0;
        int end=0;
        int product=1;
        int ans=0;
        while(end<arr.length) {
            //grow
            product *= arr[end];

            //shrink
            while (product >= k) {
                product /= arr[start];
                start++;
            }
            //ans update
            ans = ans + (end - start + 1);
            end++;
        }
        return ans;
    }
}
