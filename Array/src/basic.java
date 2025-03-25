package Array.src;

import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 70;
        arr[4] = 80;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        int[] other = arr;
        other[2] = 9;
        System.out.println(arr[2]);

    }
}