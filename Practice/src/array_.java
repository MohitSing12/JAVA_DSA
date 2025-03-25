public class array_ {
    public static void main(String[] args) {
        int[] arr={9,7,8,3,1,2,4};
        partition(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void partition(int[] arr,int si,int ei){
        int idx=si;
        int item=arr[ei];
        for (int i=0;i<ei;i++){
            if(arr[i]<=item){
                //swap idx and arr[i]
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }

        }
        //swap idx and ei
        int temp=arr[idx];
        arr[idx]=arr[ei];
        arr[ei]=temp;


    }
}
