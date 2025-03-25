public class print_no {
    public static void main(String[] args) {
        int n=5;//print from 5 to 1;
        prnt(n);
    }
    public static void prnt(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        prnt(n-1);

    }
}
