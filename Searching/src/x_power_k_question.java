//We have to find a no. x such that x^k<=n is true and x has the greatest value where k and n are user input.
public class x_power_k_question {
    public static void main(String[] args) {
        int n = 87;
        int k = 3;
        System.out.println(kthroot(n, k));

    }

    public static int kthroot(int n, int k) {
        int low = 1;
        int high = n;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
