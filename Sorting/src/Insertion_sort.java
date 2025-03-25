public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={8,6,4,2,1,-1,-2,0};
        Sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        //We have started the loop from 1 bcz the element at 0 is considered to be sorted.
        for (int i=1;i<arr.length;i++){
            int picked=arr[i];//Hand picked card
            int j=i-1;
            while(j>=0 && arr[j]>picked){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=picked;
        }
    }
}
