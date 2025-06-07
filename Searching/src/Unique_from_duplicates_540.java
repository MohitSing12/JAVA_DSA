package Searching.src;

public class Unique_from_duplicates_540 {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,8,8};
        unique(arr);
    }
    public static void unique(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(mid%2!=0){
                mid--;
            }
            if(arr[mid]==arr[mid+1]){
                low=mid+2;
            }
            else{
                high=mid;
            }
        }
        System.out.println(arr[low]);
    }
}
