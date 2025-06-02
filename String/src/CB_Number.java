package String.src;

import java.util.Scanner;

public class CB_Number {
    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//       String s=sc.next();
        String s = "1331";


        System.out.println(substring(s));
    }

        public static int substring(String s) {
        int count = 0;
        boolean[] visited = new boolean[s.length()];
        for (int len = 1; len <= s.length(); len++) {

            for (int j = len; j <= s.length(); j++) {

                int i = j - len;
                String str = s.substring(i, j);

                //Integer.parseint() It will convert the number string into the integer
                long n = Long.parseLong(str);

                if (is_CB_Number(n) == true && is_valid(visited, i, j) == true) {
System.out.println(n);
                    count++;
                    //i to j-1 marked bcz ye CB bana chuke hain
                    for (int k = i; k < j; k++) {

                        visited[k] = true;
                    }
                }
            }

        }

        return count;
    }

    public static boolean is_CB_Number(long num) {

        if (num == 0 || num == 1) {
            return false;
        }
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
            for (int i = 0; i < arr.length; i++) {
                if (num % arr[i] == 0) {
                    return false;
                }
            }

        return true;
    }

    public static boolean is_valid(boolean[] visited, int i, int j) {


        for (; i < j; i++) {
            if (visited[i] == true) {
                return false;
            }
        }
        return true;
    }


}
