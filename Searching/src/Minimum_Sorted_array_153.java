package Searching.src;

public class Minimum_Sorted_array_153 {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,1,2};
        int min=mini(arr);
        System.out.println(min);
    }
    public static int mini(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>=arr[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return arr[low];
    }
}
