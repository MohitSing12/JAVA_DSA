import java.util.Scanner;

public class Search_array_240 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr = new int [r][c];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int item = sc.nextInt();
        System.out.println( (search(arr, item)));
sc.close();
    }

    public static boolean search(int[][] arr, int x) {
        int r = 0;
        int c = arr[0].length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == x) {
                return true;
            } else if (arr[r][c] > x) {
                c--;
            } else {
                r++;
            }
        }
        {

        }
        return false;
    }
}



//2nd solution
//    public static boolean search(int[][] arr, int item) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (arr[i][j] == item) {
//                    return true;
//                }
//
//
//            }
//        }
//        return false;
//    }
//}
