package Basics.src;

import java.util.Scanner;

public class max_3_no_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The greatest value is of a:" + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest value is of b:" + b);

        } else {
            System.out.println("The greatest value is of c:" + c);
        }

    }
}
