package Array_question.src;

public class second_largest_second_smallest {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};
        int n = arr.length;


//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
        System.out.println(second_large(arr, n));
        System.out.println(second_small(arr, n));
        getSecondOrderElements(n, arr);
    }
    public static int[] getSecondOrderElements(int n, int []arr) {
       int a= second_large(arr, n);
        int b=second_small(arr, n);
        int [] arr1={a,b};

        return arr1;
    }
    public static int second_large(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        int second_Largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second_Largest = largest;
                largest = arr[i];

            } else if (arr[i] > second_Largest && arr[i] != largest) {
                second_Largest = arr[i];
            }
        }
        return second_Largest;
    }

    public static int second_small(int[] arr, int n) {
        int smallest = Integer.MAX_VALUE;
        int second_Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                second_Smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < second_Smallest && arr[i] != smallest) {
                second_Smallest = arr[i];
            }
        }
        return second_Smallest;
    }


//    public static int[] sort(int [] arr,int n){
//        for(int turn=1;turn<n;turn++){
//            for(int i=0;i<n-turn;i++){
//                if(arr[i]>arr[i+1]){
//                    int item=arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=item;
//                }
//            }
//        }
//        return arr;
//    }
}
