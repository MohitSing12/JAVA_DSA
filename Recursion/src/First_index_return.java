public class First_index_return {
    public static void main(String[] args) {
        int [] arr={3,2,5,7,5,6,5,15,5};
        int item=5;
        System.out.println(index(arr,0,50));
    }
    public static int index(int[] arr,int i,int item){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==item){
            return i;
        }

        return index(arr,i+1,item);
    }
}
