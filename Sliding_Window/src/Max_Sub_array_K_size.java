public class Max_Sub_array_K_size {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5, 1, 3, 7, 8, 4, 1};
        int k = 3;
        System.out.println(  Max_sum(arr,k));


    }
    public static int Max_sum(int[] arr,int k){
        int sum = 0;
        int ans=0;
        //1st window ka kaam
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        ans = sum;

        for (int i=k;i<arr.length;i++){
            sum+=arr[i];//Grow
            sum-=arr[i-k];//Shrink
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}