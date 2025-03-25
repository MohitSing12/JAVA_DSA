package Array_question.src;

public class remove_Element_27 {
    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        int val=3;
        remove(arr,3);
    }
    public static void remove(int[] arr,int val){
        int count=0;
        int j=0;
        int[] arr1=new int [4];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                continue;
            }
            else{
                arr1[j]=arr[i];
                j++;
                count++;
            }
        }
        System.out.println(count);
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}
