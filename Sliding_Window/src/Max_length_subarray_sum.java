package Sliding_Window.src;

public class Max_length_subarray_sum {
    public static void main(String[] args) {
        int[] arr={1,2,5};
        int k=5;
        System.out.println(max_subarray(arr,k));
    }
//    public static int max_subarray(int[] arr,int k){
//        int n=arr.length;
//        int sum=0;
//        for(int i=0;i<n;i++){
//            int cal=0;
//            for(int j=i;j<n;j++){
//                cal+=arr[j];
//                if(cal==k){
//                    sum=Math.max(sum,(j-i+1));
//                }
//
//
//            }
//
//        }
//        if(sum==0){
//            return -1;
//        }
//        return sum;
//    }
    public static int max_subarray(int[] arr,int k){
        int si=0;
        int ei=0;
        int n=arr.length;
        int sum=0;
        int ans=0;
        while(ei<n){
            sum+=arr[ei];


            while(sum>k){

                sum-=arr[si];
                si++;
            }

            if(sum==k){

                ans=Math.max(ans,(ei-si+1));
            }
            ei++;
        }
        return ans;
    }

}
