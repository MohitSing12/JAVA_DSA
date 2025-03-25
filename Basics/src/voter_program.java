package Basics.src;

import java.util.Scanner;

public class voter_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else
            System.out.println("The number is odd");
    }
}




