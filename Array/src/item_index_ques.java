package Array.src;

public class item_index_ques {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int item=4;
        System.out.println(check(arr,item));
    }
    public static int check(int []arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;

            }

        }
        return -1;
    }

}
