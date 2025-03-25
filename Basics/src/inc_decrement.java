package Basics.src;

public class inc_decrement {
    public static void main(String[] args) {
        int a=9;
        int b=8;
        System.out.println(a++);

        System.out.println(--a);

        int c=a++ - b++ - b-- +a++;
        System.out.println(c);
    }
}
