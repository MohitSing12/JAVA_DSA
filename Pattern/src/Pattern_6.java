package Pattern.src;

import java.util.Scanner;
//*****
//  ****
//    ***
//      **
//        *
public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of row:");
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=0;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            row++;
            System.out.println();
            space=space+2;
            star--;

        }

    }
}
