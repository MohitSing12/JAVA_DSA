package Data_type.src;

import java.util.Scanner;

public class decmal_to_any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int src_base = sc.nextInt();
        int des_base = sc.nextInt();
        int mul = 1;
        int sum = 0;

        while (num > 0) {
            int rem = num % des_base;
            sum = sum + rem * mul;
            mul = mul * src_base;
            num = num / des_base;
        }
        System.out.println(sum);
    }
}
