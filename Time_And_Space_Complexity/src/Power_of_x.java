package Time_And_Space_Complexity.src;

import java.util.Arrays;

public class Power_of_x {
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(pow(x,n));
    }
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int ans=pow(x,n/2);
        ans=ans*ans;
        if(n%2!=0){
            return ans*x;
        }
        return ans;
    }
}
