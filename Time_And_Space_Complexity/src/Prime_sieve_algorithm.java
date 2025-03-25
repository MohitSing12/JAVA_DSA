public class Prime_sieve_algorithm {
    public static void main(String[] args) {
        int n = 100;
        primesieve(n);
    }

    public static void primesieve(int n) {
        boolean[] arr = new boolean[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        //code logic
        for (int i = 2; i * i < arr.length; i++) {
            for (int j = 2; j * i < arr.length; j++) {
                arr[i * j] = false;
            }
        }
        //return prime
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}
