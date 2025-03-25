

public class Max_subarray_53 {
    public static void main(String[] args) {
        int []arr={2,3,-7,11,-1,3};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                ans=Math.max(sum,ans);
            }
        }
        return ans;
    }
}
