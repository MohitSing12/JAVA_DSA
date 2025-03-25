package Function.src;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.pow;

public class xyz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(is_armstrong(n));

    }

    public static boolean is_armstrong(int n) {
        int count = count_no(n);
        int sum = 0;
        int a = n;
        while (a > 0) {
            int digit = 0;
            digit = a % 10;
            sum = (int) (sum + pow(digit, count));
            a = a / 10;
        }

        if (sum == n) {
           return true;
        } else {

            return false;
        }


    }

    public static int count_no(int a) {

        int count = 0;
        while (a != 0) {

            a = a / 10;
            count++;
        }
        return count;


    }


}
