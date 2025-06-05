package Searching.src;

public class Floor_ceil_problem_striver {
    public static void main(String[] args) {
        int[] arr={3, 4, 4, 7, 8, 10};
        int x=5;
        int[] arr1= getFloorAndCeil(arr,x);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    public static int[] getFloorAndCeil(int[] arr, int x) {
        int low=0;
        int high=arr.length-1;

        int ans1=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans1=Math.max(ans1,arr[mid]);
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        int ans2=arr[arr.length-1];
        low=0;
        high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){

                ans2=Math.min(ans2,arr[mid]);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        int[] arr1=new int[2];
        arr1[0]=ans1;
        arr1[1]=ans2;
        return arr1;


    }
}
