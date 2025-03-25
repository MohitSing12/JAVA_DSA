package Data_type.src;

import java.util.Scanner;

//Sample input:
//32145
//output:
//12543
public class inverse_no_program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int pos=1;
        while(n>0){
            int rem=n%10;
            sum=(int)(sum+pos*Math.pow(10,rem-1));
            pos++;
            n=n/10;
        }
        System.out.println(sum);
    }
}
