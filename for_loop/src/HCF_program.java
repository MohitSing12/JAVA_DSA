package for_loop.src;

import java.util.Scanner;
public class HCF_program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        while(y%x!=0){
            int rem = y%x;
            y = x;
            x = rem;

        }
        System.out.println("The HCF is:"+x);
    }
}
