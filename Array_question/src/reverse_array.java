package Array_question.src;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
//        int [] arr={2,3,5,3,6,7,9};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        swap(arr);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
//    public static void swap(int[] arr){
//
//        int i=0;
//        int j=arr.length-1;
//        while(i<j){
//           int temp=arr[i];
//           arr[i]=arr[j];
//           arr[j]=temp;
//           i++;
//           j--;
//        }
//
//    }
    public static void swap(int[] arr){

        int j=arr.length-1;
        for(int i=0;i<j;i++){
            int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;

           j--;
        }
    }
}