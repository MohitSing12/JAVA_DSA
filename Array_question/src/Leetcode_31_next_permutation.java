package Array_question.src;

import java.util.Arrays;

public class Leetcode_31_next_permutation {
    public static void main(String[] args) {
        int[] arr={2,3,1};
        nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void nextPermutation(int[] arr) {
        int item=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i+1]>arr[i]){
                item=i;
                break;
            }
        }
        if(item==-1){
            Arrays.sort(arr,0,arr.length);

        }

        else{

            for(int j=arr.length-1;j>item;j--){
                if(arr[j]>arr[item]){
                    int temp=arr[j];
                    arr[j]=arr[item];
                    arr[item]=temp;
                    break;
                }

            }
            Arrays.sort(arr,item+1,arr.length);
        }

    }
}

