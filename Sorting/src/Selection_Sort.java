public class Selection_Sort {
    public static void main(String[] args) {
//        int[] arr={0,-1,-2,2,4,6};
        int[] arr={6,4,2,1,0};
        Sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                //Code for swap
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}
