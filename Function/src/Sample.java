package Function.src;

public class Sample {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int i = 5;
        int j = 4;

        Add(a, b);
        System.out.println(a + b);
        System.out.println(Addd(a, i));
    }

    public static void Add(int a, int b) {
        int c = a + b;
        System.out.println(c);

    }

    public static int Addd(int a, int b) {
        int e = a + b;
//        System.out.println(e);
        return e;
    }
}