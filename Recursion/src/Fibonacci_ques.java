package Recursion.src;

public class Fibonacci_ques {
    public static void main(String[] args) {
        int n=6;

        System.out.println( fibo(n));
    }
    public static int fibo(int n){
        if(n==0||n==1){
//            System.out.println(n);
            return n;
        }
        int f1=fibo(n-1);

        int f2=fibo(n-2);
//        System.out.print(f1+f2+" ");
//        System.out.println();
       return f1+f2;

    }
}
