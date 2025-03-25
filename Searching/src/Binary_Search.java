public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int item=7;
        int a=Sort(arr,item);
        System.out.println(a);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
    public static int Sort(int[] arr,int item) {
        int low = 0;
        int high = arr.length - 1;
        while(high>low){
            int mid=(high+low)/2;
            if(arr[mid]==item){
                return arr[mid];
            } else if (arr[mid]>item) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return -1;
    }
}