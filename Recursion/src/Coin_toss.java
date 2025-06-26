public class Coin_toss {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Printanswer(n, ""));
    }

    public static int Printanswer(int n, String ans) {
        if (n == 0) {
            System.out.print(ans + " ");
            return 1;

        }
        int a1= Printanswer(n - 1, ans+"H");
        int b1=Printanswer(n - 1, ans+"T");
        return a1+b1;
    }
}
