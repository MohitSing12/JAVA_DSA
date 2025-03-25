import java.util.Scanner;

public class Code_for_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n));
    }

    public static boolean prime(int n) {
        int div = 2;
        while (div * div <= n) {
            if (n % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }
}
