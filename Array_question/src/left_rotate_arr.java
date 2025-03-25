package Array_question.src;

public class left_rotate_arr {
    public static void main(String[] args) {
        int [] arr={1,2,7,7,5};
        int n=arr.length;
        rotate(arr,n);
    }
    public static void rotate(int[] arr,int n){
        int last=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=last;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
