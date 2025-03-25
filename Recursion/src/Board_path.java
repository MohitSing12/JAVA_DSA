public class Board_path {
    public static void main(String[] args) {
        int n=4;
        Boardpath(n,0,"");
    }
    public static void Boardpath(int n,int curr,String ans){
        if(curr==n){
            System.out.print(ans+" ");
            return;
        }
        if(curr>n){
            return;
        }
//        Boardpath(n,curr+1,ans+1);
//        Boardpath(n,curr+2,ans+2);
//        Boardpath(n,curr+3,ans+3);
        for(int dice=1;dice<=3;dice++){
            Boardpath(n,dice+curr,dice+ans);
        }
    }
}
