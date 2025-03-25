public class Lexco_counting {
    public static void main(String[] args) {
       int n=1;
        PrintCounting(1,n);
    }
    public static void PrintCounting(int curr,int n){
        if(curr>n){
            return;
        }
//        if(curr==0){
//            continue;
////            System.out.println(curr);
//        }

        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;

        }

        for (;i<=9;i++){
            PrintCounting(curr*10+i,n);

        }


    }
}
