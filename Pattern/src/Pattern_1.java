package Pattern.src;

import java.util.Scanner;

//*****
//*****
//*****
//*****
//*****

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of row:");
        int n = sc.nextInt();
        int row = 1;
        int star = n;

//int i=1;
        while (row <= n) {
            int i = 1;
            //Star printing in the same row
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            row++;
            System.out.println();


        }


    }
}
