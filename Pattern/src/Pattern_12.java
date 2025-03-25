package Pattern.src;

import java.util.Scanner;

// * * * * *
// * *   * *
// *       *
// * *   * *
// * * * * *
public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n/2+1;
        int space=-1;
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
            if(star == n/2+1){
                z=2;
           }
            while(z<=star){

                System.out.print("* ");
                z++;
            }
            if(row<=n/2){
                space+=2;
                star--;
            }
            else{
                space-=2;
                star++;
            }
            row++;
            System.out.println();

        }

    }
}
