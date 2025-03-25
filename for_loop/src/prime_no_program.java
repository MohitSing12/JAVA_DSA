package for_loop.src;

import java.util.Scanner;

public class prime_no_program {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                count++;
            }
        }

            if (count >= 1) {
                System.out.println("The Number is not prime");
            } else {
                System.out.println("The number is prime");
            }

    }
}
