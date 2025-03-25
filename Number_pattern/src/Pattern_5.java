package Number_pattern.src;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        while(row<=n){
            int val=1;
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                if(j>=star/2+1){
                    System.out.print(val+" ");
                    val--;
                }
                else {
                    System.out.print(val+" ");
                    val++;
                }
                j++;


            }
            row++;
            star+=2;
            space--;
            System.out.println();
        }

    }
}
