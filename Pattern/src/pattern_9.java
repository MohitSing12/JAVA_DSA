package Pattern.src;

import java.util.Scanner;
//*       *
//**     **
//***   ***
//**** ****
//*********
public class pattern_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=2*n-3;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){

                System.out.print("  ");
                j++;
            }
            int z=1;
            if(row==n){
                z=2;
            }
            while(z<=star){
                System.out.print("* ");
                z++;
            }
            row++;
            star++;
            space-=2;
            System.out.println();

        }

    }
}
