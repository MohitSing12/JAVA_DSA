


import java.util.*;

public class prac {
    public static boolean canWePlace(int[] stalls, int dist, int cows) {
        int len = stalls.length; //size of array
        int cntCows = 1; //no. of cows placed
        int last = stalls[0]; //position of last placed cow.
        for (int i = 1; i < len; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++; //place next cow.
                last = stalls[i]; //update the last location.
            }
            if (cntCows >= cows) return true;
        }
        return false;
    }
    public static int aggressiveCows(int n,int k,int[] stalls) {
        int len = stalls.length; //size of array
        //sort the stalls[]:
        Arrays.sort(stalls);

        int low = 1, high = stalls[len - 1] ;
        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(stalls, mid, k) == true) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return high;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int[] stalls=new int[n];
        for (int i=0;i<stalls.length;i++){
            stalls[i]=sc.nextInt();
        }
        int ans = aggressiveCows(n,k,stalls);
        System.out.println(ans);
        sc.close();
    }
}

