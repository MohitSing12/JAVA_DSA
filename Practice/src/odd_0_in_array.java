import java.util.Scanner;

public class odd_0_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int a=call(arr, 0, 0,0);
        System.out.println(a);
    }

    public static int call(int[] arr, int digit, int count,int a) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            while (x > 0) {
                digit = x % 10;
                if (digit == 0) {
                    count++;
                }
                x = x / 10;
            }
            if (count % 2 != 0) {
                a++;
            }
            count = 0;
        }
        return a;
    }

}
