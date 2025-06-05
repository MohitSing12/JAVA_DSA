package Searching.src;

public class First_last_occurence_34_leetcode {
    public static void main(String[] args) {
        int[] arr= {5, 7, 7, 8, 8, 10};
        int x=8;
        int[] arr1=searchRange(arr,8);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    public static int[] searchRange(int[] arr, int x) {
        int[] result={-1,-1};
        int left=binarySearch(arr,x,true);
        int right=binarySearch(arr,x,false);
        result[0]=left;
        result[1]=right;
        return result;
    }
    private static int binarySearch(int[] arr,int x,boolean isSearchingLeft){
        int low=0;
        int high=arr.length-1;
        int idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                idx=mid;
                if(isSearchingLeft){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return idx;
    }
}
