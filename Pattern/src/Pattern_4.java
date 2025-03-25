package Pattern.src;

import java.util.Scanner;
//    *
//   * *
//  * * *
// * * * *
//* * * * *
public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of row:");
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;
        while (row <= n) {
            //space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }


            //star
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            //next row
            row++;
            System.out.println();
            star++;
            space--;


        }

    }
}
