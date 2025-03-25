package Function.src;

public class Sample_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int ans = Add(a, b);
        System.out.println(ans);
    }

    public static int Add(int a, int b) {
        int c = a + b;
        System.out.println(Sub(c, a));
        return c;

    }

    public static int Sub(int a, int b) {
        return a - b;
    }
}
