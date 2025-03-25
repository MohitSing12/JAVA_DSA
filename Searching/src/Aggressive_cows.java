import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nos=sc.nextInt();
        int noc= sc.nextInt();
        int[] stall=new int[nos];
        for (int i=0;i<stall.length;i++){
            stall[i]=sc.nextInt();
        }
        Arrays.sort(stall);


       System.out.println(Min_distance(stall,noc));
    }
    public static int Min_distance(int[] stall,int noc){
        int low=stall[0];
        int high=stall[stall.length-1];
        int ans=0;
        while(low<=high) {
            int mid=(low+high)/2;
            if (is_it_possible(stall, noc, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
    public static boolean is_it_possible(int[] stall,int noc,int mid){
        int pos=stall[0];
        int cow_count=1;
        for (int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow_count++;
                pos=stall[i];
            }

        }
        if(cow_count>=noc){
            return true;
        }
        return false;
    }
}
