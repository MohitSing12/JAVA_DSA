package Searching.src;

public class Insert_position_35_leetcode {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7};
        int x=7;
       int a= position(arr,x);
       System.out.println(a);

    }
    public static int position(int[] arr,int x){
        int pos=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) {
                pos = Math.max(pos, mid);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
            if(pos==-1){
                return 0;
            }
            if(arr[pos]==x){
                return pos;
            }
            else{
                return pos+1;
            }


    }

}
