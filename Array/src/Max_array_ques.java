package Array.src;

public class Max_array_ques {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 56, 2, 534};
       max(arr);

    }

    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>max) {
                max = arr[i];
            }

        }
        System.out.println(max);

    }


//    2nd method
//    public static void max_2(){
//        int max=Integer.MIN_VALUE;
    //Rest is same.
//    }


    //3rd method
    // max=Math.max(arr[i],max);
}
