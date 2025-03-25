package Number_pattern.src;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        int val=1;
        while(row<=2*n-1){

            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            int p=val;
            while(j<=star){

                if(j>=star/2+1){
                    System.out.print(p+" ");
                    p--;
                }
                else{
                    System.out.print(p+" ");
                    p++;
                }


                j++;
            }
            if(row>=n){
                star-=2;
                space++;
                val--;
            }
            else{
                star+=2;
                space--;
                val++;
            }
            row++;
//            val=1;

            System.out.println();
        }
    }
}
