import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int []arr=new int[n];
        int[] arr={7,4,3,-2,-1,0};

//
//        for (int i=0;i< arr.length;i++){
//            arr[i]=sc.nextInt();
//        }

        swap(arr);
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void swap(int[] arr ){
        for(int turn=1;turn<arr.length;turn++){
            for (int i=0;i< arr.length-turn;i++){
                if(arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}