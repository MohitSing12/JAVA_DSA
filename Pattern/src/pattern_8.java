package Pattern.src;

import java.util.Scanner;
//        *
//      * ! *
//    * ! * ! *
//  * ! * ! * ! *
//* ! * ! * ! * ! *
public class pattern_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space=n-1;
        while (row <= n) {
            int i=1;
            //Here space for the first iteration is 4.
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){

               if(j%2!=0){
                   System.out.print("* ");
               }
               else{
                   System.out.print("! ");
               }
                j++;
            }

            row++;
            star+=2;
            System.out.println();
            space--;

        }

    }
}
