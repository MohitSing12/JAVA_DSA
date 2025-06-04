package Array_question.src;

import java.util.Scanner;

public class zeroes_at_the_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
        int[] arr = {1,2,0,1,0,5};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }

        int n = arr.length;
        end_zeroes(arr, n);
    }

//    public static void end_zeroes(int[] arr, int n) {
//        int j = -1;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) {
//                j = i;
//                break;
//            }
//        }
//        if (j == -1) {
//            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//        for (int i = j+1; i < n; i++) {
//            if (arr[i] != 0) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j++;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
    //Alternate approach
    public static void end_zeroes(int[] arr,int n){
        int pos=0;
        for(int num:arr){
            if(num!=0){
                arr[pos++]=num;
            }
        }
        while(pos<arr.length){
            arr[pos++]=0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
