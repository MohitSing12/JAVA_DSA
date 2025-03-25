package Array_question.src;

public class Sorted_array {
    public static void main(String[] args) {
        int [] arr={4 ,5 ,4, 4 ,4};
        int n=arr.length;
        System.out.println(is_sorted(arr,n));
    }
    public static int is_sorted(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }
            else{
                return -1;
            }

        }
        return 1;
    }
}
